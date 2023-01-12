package com.example.test

class Math {

    fun add(a: String, b: String): String {
        var resut = ""

        if (a.isNumeric() && b.isNumeric()) {
            resut = (a.toDouble() + b.toDouble()).toString()
        } else if (a.isEmpty() || b.isEmpty()) {
            resut = "Вы не заполнили поля"
        } else if (a.contains(" ") || b.contains(" ")) {
            resut = "Вы ввели пробел"
        } else {
            resut = "Вы ввели буквы"
        }
        return resut
    }

    fun divide(a: String, b: String): String {
        var resut = ""

        if (!a.isNumeric() || !b.isNumeric()) {
            resut = "Вы ввели буквы"
        } else if (a.isEmpty() || b.isEmpty()) {
            resut = "Вы не заполнили поля"
        } else if (b == "0.0" || a =="0.0") {
            resut = "Нельзя делить на ноль"
        }  else {
            resut = (a.toDouble() / b.toDouble()).toString()
        }
        return resut
    }


    fun String.isNumeric(): Boolean {
        val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
        return this matches (regex)
    }

}