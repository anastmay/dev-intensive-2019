package ru.skillbranch.devintensive.utils

import java.util.*

object Utils {
    fun parseFullName(fullName : String?) : Pair<String?, String?>{
        val parts : List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        when (firstName){
            "" -> firstName = null
        }
        when (lastName){
            "" -> lastName = null
        }
        return Pair(firstName, lastName)
    }
    fun toInitials(firstName: String?, lastName:String?) : String? {
        var initial1 : String?
        var initial2 : String?
        var initials : String? = ""
        initial1 = (firstName?.getOrElse(0) {' '}).toString()
        initial2 = (lastName?.getOrElse(0) {' '}).toString()
        when (initial1){
            " " -> initial1=""
        }
        when (initial2){
            " " -> initial2=""
        }
        initials=(initial1+initial2).toUpperCase()
        when (initials){
            "" -> initials = null
        }
        return initials
    }
    fun transliteration(payload:String?, divider:String? = " ") : String? {
        val spayload : String = (payload ?: " ").toLowerCase()
        val sdivider : String = divider ?: " "
        val words : List<String> = spayload.split(" ")
        var transliteration : Array<String> = arrayOf("","")
        var i : Int = 0
        for (word in words) {
            for (letter in word){
                when (letter.toString()) {
                    "а" -> transliteration[i] = transliteration[i] + "a"
                    "б" -> transliteration[i] = transliteration[i] + "b"
                    "в" -> transliteration[i] = transliteration[i] + "v"
                    "г" -> transliteration[i] = transliteration[i] + "g"
                    "д" -> transliteration[i] = transliteration[i] + "d"
                    "е" -> transliteration[i] = transliteration[i] + "e"
                    "ё" -> transliteration[i] = transliteration[i] + "e"
                    "ж" -> transliteration[i] = transliteration[i] + "zh"
                    "з" -> transliteration[i] = transliteration[i] + "z"
                    "и" -> transliteration[i] = transliteration[i] + "i"
                    "й" -> transliteration[i] = transliteration[i] + "i"
                    "к" -> transliteration[i] = transliteration[i] + "k"
                    "л" -> transliteration[i] = transliteration[i] + "l"
                    "м" -> transliteration[i] = transliteration[i] + "m"
                    "н" -> transliteration[i] = transliteration[i] + "n"
                    "о" -> transliteration[i] = transliteration[i] + "o"
                    "п" -> transliteration[i] = transliteration[i] + "p"
                    "р" -> transliteration[i] = transliteration[i] + "r"
                    "с" -> transliteration[i] = transliteration[i] + "s"
                    "т" -> transliteration[i] = transliteration[i] + "t"
                    "у" -> transliteration[i] = transliteration[i] + "u"
                    "ф" -> transliteration[i] = transliteration[i] + "f"
                    "х" -> transliteration[i] = transliteration[i] + "h"
                    "ц" -> transliteration[i] = transliteration[i] + "c"
                    "ч" -> transliteration[i] = transliteration[i] + "ch"
                    "ш" -> transliteration[i] = transliteration[i] + "sh"
                    "щ" -> transliteration[i] = transliteration[i] + "sh"
                    "ъ" -> transliteration[i] = transliteration[i] + ""
                    "ы" -> transliteration[i] = transliteration[i] + "i"
                    "ь" -> transliteration[i] = transliteration[i] + ""
                    "э" -> transliteration[i] = transliteration[i] + "e"
                    "ю" -> transliteration[i] = transliteration[i] + "yu"
                    "я" -> transliteration[i] = transliteration[i] + "ya"
                    else -> {transliteration[i] = transliteration[i] + letter.toString()}
                }
            }
            i+=1
        }
        val translit : String = transliteration[0].capitalize() + sdivider + transliteration[1].capitalize()
        return (translit)
    }
}