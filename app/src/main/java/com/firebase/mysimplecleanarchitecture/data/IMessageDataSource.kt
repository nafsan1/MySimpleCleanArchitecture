package com.firebase.mysimplecleanarchitecture.data

import com.firebase.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name:String):MessageEntity
}