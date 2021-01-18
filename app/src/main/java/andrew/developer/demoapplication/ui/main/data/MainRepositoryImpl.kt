package andrew.developer.demoapplication.ui.main.data

import andrew.developer.demoapplication.api.Api
import andrew.developer.demoapplication.data.RepositoryImpl
import andrew.developer.demoapplication.data.entity.AlbumsItem
import andrew.developer.demoapplication.storage.dao.AlbumDao
import andrew.developer.demoapplication.ui.main.domain.MainRepository
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val dataBase: AlbumDao,
    private val api: Api
) : RepositoryImpl(), MainRepository {

    override suspend fun loadAlbums() = ioAsync {
        api.getAlbums()
            .onEach {
                dataBase.insert(MainMapper().mapToDB(it))
            }
    }

    override suspend fun getAlbums(): ArrayList<AlbumsItem>? = ioAsync {
        dataBase.getAlbums()
            ?.map { MainMapper().mapToModel(it) } as ArrayList?
    }
}