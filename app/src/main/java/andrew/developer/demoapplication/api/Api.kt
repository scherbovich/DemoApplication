package andrew.developer.demoapplication.api

import andrew.developer.demoapplication.data.entity.AlbumsItem
import retrofit2.Response
import retrofit2.http.*

interface Api {

    @GET("/albums")
    suspend fun getAlbums(): List<AlbumsItem>
}