package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage (
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date: Date = Date()
) {
    abstract fun formatmessage () : String
    companion object AbstractFactory{
        var lastId = -1
        fun makeMessage(from: User?, chat: Chat, date: Date = Date(), type: TypeUnits = TypeUnits.Text, payload: Any?, isIncoming: Boolean = false): BaseMessage{
            lastId++
            return when(type){
                TypeUnits.Image -> ImageMessage("$lastId", from, chat, isIncoming, date = date, image = payload as String)
                else -> TextMessage("$lastId", from, chat, isIncoming, date = date, text = payload as String)

            }
        }
        enum class TypeUnits{
            Text,
            Image
        }
    }
}