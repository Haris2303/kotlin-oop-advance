package org.example

import org.example.data.Student

fun main() {
    val student = Student("Ucup", 20)

//    Function let
    val result1: String = student.let {
        "My name is ${it.name} and my age is ${it.age}"
    }
    println(result1)

//    Function run
    val result2: String = student.run {
        "My name is ${this.name} and my age is ${this.age}"
    }
    println(result2)

//    Function apply
    val result3: Student = student.apply {
        "My name is ${this.name} and my age is ${this.age}"
    }
    println(result3)

//    Function also
    val result4: Student = student.also {
        "My name is ${it.name} and my age is ${it.age}"
    }
    println(result4)

    //    Function also
    val result5: String = with(student) {
        "My name is ${this.name} and my age is ${this.age}"
    }
    println(result5)
}