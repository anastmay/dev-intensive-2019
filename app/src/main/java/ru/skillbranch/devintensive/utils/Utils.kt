package ru.skillbranch.devintensive.utils

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
        initial1 = "${firstName?.getOrElse(0) {' '}}"
        initial2 = "${lastName?.getOrElse(0) {' '}}"
        initials=initial1+initial2
        return initials
    }
}