package com.firebase.mysimplecleanarchitecture.data

import com.firebase.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource :IMessageDataSource{
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Hello $name! Welcome to Clean Architecture")
}
