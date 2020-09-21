package com.firebase.mysimplecleanarchitecture.di

import com.firebase.mysimplecleanarchitecture.data.IMessageDataSource
import com.firebase.mysimplecleanarchitecture.data.MessageDataSource
import com.firebase.mysimplecleanarchitecture.data.MessageRepository
import com.firebase.mysimplecleanarchitecture.domain.IMessageRepository
import com.firebase.mysimplecleanarchitecture.domain.MessageInteractor
import com.firebase.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase():MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()

    }
}