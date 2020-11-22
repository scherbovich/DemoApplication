package andrew.developer.demoapplication.ui.main.domain

import andrew.developer.demoapplication.domain.Interactor

interface MainInteractor: Interactor<MainInteractorOut> {
    fun loadAlbums()
}