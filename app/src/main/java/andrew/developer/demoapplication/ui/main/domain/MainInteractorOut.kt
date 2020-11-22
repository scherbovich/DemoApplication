package andrew.developer.demoapplication.ui.main.domain

import andrew.developer.demoapplication.data.entity.AlbumsItem
import andrew.developer.demoapplication.domain.InteractorOut

interface MainInteractorOut: InteractorOut {

    fun isLoading(loading: Boolean)
    fun onLoaded(albums: ArrayList<AlbumsItem>)
    fun onError(e: Throwable)
}
