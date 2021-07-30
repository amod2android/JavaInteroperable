package com.amod2android.javainteroperable

class Student(var _name: String,var _roll: Int) {

    @JvmField
    var roll: Int = 0

    @JvmField
    var name: String = ""

    init {
        this.name=_name
        this.roll=_roll
    }

    companion object{
        @JvmStatic
        fun getStudent(): Student {
            return Student("Amod",1604)
        }
    }
}