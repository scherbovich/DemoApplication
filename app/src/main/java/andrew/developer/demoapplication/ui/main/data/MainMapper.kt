package andrew.developer.demoapplication.ui.main.data

import andrew.developer.demoapplication.data.Mapper
import andrew.developer.demoapplication.data.entity.AlbumsItem
import andrew.developer.demoapplication.storage.entity.AlbumEntity

class MainMapper: Mapper<AlbumsItem, AlbumEntity>() {

    override fun mapToDB(from: AlbumsItem): AlbumEntity {
        return AlbumEntity(
            from.id,
            from.title,
            from.userId
        )
    }

    override fun mapToModel(to: AlbumEntity): AlbumsItem {
        return AlbumsItem(
            to.id,
            to.title,
            to.userId
        )
    }
}