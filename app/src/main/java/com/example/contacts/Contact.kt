package com.example.contacts

data class Contact (val name: String, val phone:String, val email:String)
private val contacts = arrayListOf<Contact>()

class ContactDAO{

    fun save(contact: Contact){
        contacts.add(contact)
    }

    fun getAll() : Array<Any> {
        return contacts.toArray().copyOf()
    }
}