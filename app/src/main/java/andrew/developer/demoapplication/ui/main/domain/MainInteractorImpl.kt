package andrew.developer.demoapplication.ui.main.domain

import andrew.developer.demoapplication.domain.InteractorIml
import andrew.developer.demoapplication.ui.main.data.MainRepository
import javax.inject.Inject

class MainInteractorImpl @Inject constructor(private val repository: MainRepository):
        InteractorIml<MainInteractorOut>(),
        MainInteractor {
    override fun loadAlbums() {
        launchSafely(
            { out.isLoading(it) },
            { out.onError(it) }) {
            repository.getAlbums()?.let { out.onLoaded(it) }
            out.onLoaded(repository.loadAlbums())
        }
    }
}