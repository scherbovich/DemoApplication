package andrew.developer.demoapplication.ui.main.di

import andrew.developer.demoapplication.api.Api
import andrew.developer.demoapplication.di.FragmentScope
import andrew.developer.demoapplication.storage.AppDatabase
import andrew.developer.demoapplication.storage.dao.AlbumDao
import andrew.developer.demoapplication.ui.main.data.MainRepository
import andrew.developer.demoapplication.ui.main.data.MainRepositoryImpl
import andrew.developer.demoapplication.ui.main.domain.MainInteractor
import andrew.developer.demoapplication.ui.main.domain.MainInteractorImpl
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @FragmentScope
    @Provides
    fun provideAlbumDao(appDatabase: AppDatabase): AlbumDao =
        appDatabase.albumDao()

    @FragmentScope
    @Provides
    fun provideMainRepository(api: Api, database: AlbumDao): MainRepository =
        MainRepositoryImpl(database, api)

    @FragmentScope
    @Provides
    fun provideMainInteractor(repository: MainRepository): MainInteractor =
        MainInteractorImpl(repository)
}