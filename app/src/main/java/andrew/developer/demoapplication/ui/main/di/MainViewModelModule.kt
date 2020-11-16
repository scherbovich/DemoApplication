package andrew.developer.demoapplication.ui.main.di

import andrew.developer.demoapplication.di.FragmentScope
import andrew.developer.demoapplication.di.ViewModelKey
import andrew.developer.demoapplication.di.ViewModelModule
import andrew.developer.demoapplication.ui.main.MainViewModel
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface MainViewModelModule: ViewModelModule {
    @FragmentScope
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindsMainViewModel(viewModel: MainViewModel): ViewModel
}