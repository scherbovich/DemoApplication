package andrew.developer.demoapplication.ui.main.data

import andrew.developer.demoapplication.data.Repository
import andrew.developer.demoapplication.data.entity.AlbumsItem

interface MainRepository: Repository {

    suspend fun loadAlbums(): List<AlbumsItem>
    suspend fun getAlbums(): List<AlbumsItem>?
}