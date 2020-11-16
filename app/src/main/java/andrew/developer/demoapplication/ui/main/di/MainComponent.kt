package andrew.developer.demoapplication.ui.main.di

import andrew.developer.demoapplication.di.AppComponent
import andrew.developer.demoapplication.di.FragmentScope
import andrew.developer.demoapplication.ui.main.MainFragment
import dagger.Component

@FragmentScope
@Component(
    dependencies = [AppComponent::class],
    modules = [MainViewModelModule::class]
)
interface MainComponent {
    fun inject(mainFragment: MainFragment)

    @Component.Builder
    interface Builder {
        fun appComponent(appComponent: AppComponent): Builder

        fun build(): MainComponent
    }

    companion object {
        fun init(appComponent: AppComponent): MainComponent{
            return DaggerMainComponent.builder()
                .appComponent(appComponent)
                .build()
        }
    }
}