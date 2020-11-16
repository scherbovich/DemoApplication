package andrew.developer.demoapplication.data.network

import andrew.developer.demoapplication.data.entities.Albums
import andrew.developer.demoapplication.data.entities.AlbumsItem
import retrofit2.Response
import retrofit2.http.*

interface ApiClient {

    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>

    @GET("/albums")
    suspend fun getSortedAlbums(@Query("userId") userId: Int): Response<Albums>

    @GET("/albums/{id}")
    suspend fun getAlbum(@Path(value = "id") albumId: Int): Response<AlbumsItem>

    @POST("/albums")
    suspend fun uploadAlbum(@Body album: AlbumsItem): Response<AlbumsItem>
}