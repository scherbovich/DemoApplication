package andrew.developer.demoapplication.api

import andrew.developer.demoapplication.data.entity.AlbumsItem
import retrofit2.Response
import retrofit2.http.*

interface Api {

    @GET("/albums")
    suspend fun getAlbums(): ArrayList<AlbumsItem>

    @GET("/albums")
    suspend fun getSortedAlbums(@Query("userId") userId: Int): ArrayList<AlbumsItem>

    @GET("/albums/{id}")
    suspend fun getAlbum(@Path(value = "id") albumId: Int): AlbumsItem

    @POST("/albums")
    suspend fun uploadAlbum(@Body album: AlbumsItem): Response<AlbumsItem>
}