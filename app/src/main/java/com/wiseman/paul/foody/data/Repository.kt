package com.wiseman.paul.foody.data

import com.wiseman.paul.foody.data.RemoteDataSource
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(
    localDataSource: LocalDataSource,
    remoteDataSource: RemoteDataSource
) {
    val remote = remoteDataSource
    val local = localDataSource
}