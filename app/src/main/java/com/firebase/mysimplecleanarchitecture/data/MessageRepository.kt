package com.firebase.mysimplecleanarchitecture.data

import com.firebase.mysimplecleanarchitecture.domain.IMessageRepository
import com.firebase.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource):IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}