package andrew.developer.demoapplication.storage.dao

import andrew.developer.demoapplication.storage.entity.AlbumEntity
import androidx.room.Dao
import androidx.room.Query

@Dao
interface AlbumDao: BaseDao<AlbumEntity> {

    @Query("SELECT * FROM album WHERE id = :id")
    fun getAlbum(id: Int): AlbumEntity?

    @Query("SELECT * FROM album")
    fun getAlbums(): List<AlbumEntity>?
}