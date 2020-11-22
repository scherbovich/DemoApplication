package andrew.developer.demoapplication.di

import andrew.developer.demoapplication.api.Api
import andrew.developer.demoapplication.storage.AppDatabase
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class, StorageModule::class])
@Singleton
interface AppComponent {

    fun context(): Context
    fun api(): Api
    fun appDataBase(): AppDatabase

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun context(context: Context): Builder
    }
}