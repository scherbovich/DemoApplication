package andrew.developer.demoapplication.domain

abstract class InteractorIml<T : InteractorOut> : Interactor<T>, CoroutineScopeImpl(),
    CoroutineLauncher {

    protected lateinit var out: T

    override fun setupInteractorOut(out: T) {
        this.out = out
    }
}