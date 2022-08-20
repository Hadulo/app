package com.example.agrilink

class User {
    var name:String = ""
    var email:String = ""
    var password:String = ""
    var phone:String = ""
    var id:String = ""

    constructor(name: String, email: String, idNumber: String, id: String) {
        this.name = name
        this.email = email
        this.password = password
        this.phone = phone
        this.id = id
    }
    constructor()
}