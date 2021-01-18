package andrew.developer.demoapplication.storage

import andrew.developer.demoapplication.storage.dao.AlbumDao
import andrew.developer.demoapplication.storage.entity.AlbumEntity
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, exportSchema = false, entities = [AlbumEntity::class])
abstract class AppDatabase: RoomDatabase() {

    abstract fun albumDao(): AlbumDao
}