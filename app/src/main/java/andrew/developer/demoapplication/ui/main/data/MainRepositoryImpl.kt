package andrew.developer.demoapplication.ui.main.data

import andrew.developer.demoapplication.api.Api
import andrew.developer.demoapplication.data.RepositoryImpl
import andrew.developer.demoapplication.data.entity.AlbumsItem
import andrew.developer.demoapplication.storage.dao.AlbumDao
import andrew.developer.demoapplication.storage.entity.AlbumEntity
import andrew.developer.demoapplication.ui.main.domain.MainRepository
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class MainRepositoryImpl @Inject constructor(
    private val dataBase: AlbumDao,
    private val api: Api
) : RepositoryImpl(), MainRepository {

    override suspend fun loadAlbums() = ioAsync {
        api.getAlbums()
            .onEach {
                dataBase.insert(MainMapper().mapToDB(AlbumsItem(it.id, it.title, it.userId)))
            }
    }

    override suspend fun getAlbums(): ArrayList<AlbumsItem>? = ioAsync {
        dataBase.getAlbums()
            ?.map { MainMapper().mapToModel(AlbumEntity(it.id, it.title, it.userId)) } as ArrayList
    }
}