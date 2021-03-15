package com.example.android.architecture.blueprints.todoapp.di

import com.example.android.architecture.blueprints.todoapp.ext.SampleController
import com.example.android.architecture.blueprints.todoapp.ext.SampleControllerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ExtModule {
    @Provides
    fun provideSampleController(): SampleController {
        return SampleControllerImpl()
    }
}