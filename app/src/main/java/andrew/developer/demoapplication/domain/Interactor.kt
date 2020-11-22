package andrew.developer.demoapplication.domain

interface Interactor<T: InteractorOut>: Cancellable {
    fun setupInteractorOut(out: T)
}