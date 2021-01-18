package andrew.developer.demoapplication.data

import andrew.developer.demoapplication.domain.CoroutineScopeImpl
import andrew.developer.demoapplication.domain.Repository

abstract class RepositoryImpl: Repository, CoroutineScopeImpl()