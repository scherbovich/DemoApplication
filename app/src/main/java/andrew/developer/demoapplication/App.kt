package andrew.developer.demoapplication

import andrew.developer.demoapplication.di.AppComponent
import andrew.developer.demoapplication.di.DaggerAppComponent
import android.app.Application

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger(){
        appComponent = DaggerAppComponent.builder()
            .context(this)
            .build()
    }
}