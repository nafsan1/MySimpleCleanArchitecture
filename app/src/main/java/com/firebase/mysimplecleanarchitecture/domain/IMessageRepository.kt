package com.firebase.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name:String):MessageEntity
}