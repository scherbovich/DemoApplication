package andrew.developer.demoapplication.data

import andrew.developer.demoapplication.domain.CoroutineScopeImpl

abstract class RepositoryImpl: Repository, CoroutineScopeImpl()