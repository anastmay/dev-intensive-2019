package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.extensions.formate
import java.util.*

class ImageMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var image: String
) : BaseMessage(id, from, chat, isIncoming, date ) {
    override fun formatmessage(): String = "${from?.firstName} " +
            "${if (isIncoming) "получил" else "отправил"} изображение \"$image\" ${date.formate()}"
}
