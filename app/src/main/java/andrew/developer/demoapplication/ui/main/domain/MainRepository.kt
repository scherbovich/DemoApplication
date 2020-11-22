package andrew.developer.demoapplication.ui.main.domain

import andrew.developer.demoapplication.data.entity.Albums
import andrew.developer.demoapplication.data.entity.AlbumsItem
import andrew.developer.demoapplication.domain.Repository

interface MainRepository: Repository {

    suspend fun loadAlbums(): ArrayList<AlbumsItem>
    suspend fun getAlbums(): ArrayList<AlbumsItem>?
}