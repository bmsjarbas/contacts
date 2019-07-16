package com.example.contacts

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class NewContactForm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val contactDAO = ContactDAO()
        setContentView(R.layout.activity_new_contact_form)
        val saveButton = findViewById<View>(R.id.new_contact_form_button_save)
        saveButton.setOnClickListener {
            val contactName = findViewById<EditText>(R.id.new_contact_form_contact_name)
            val contactEmail = findViewById<EditText>(R.id.new_contact_form_contact_email)
            val contactPhone = findViewById<EditText>(R.id.new_contact_form_contact_phone)
            val contact = Contact(contactName.text.toString(), contactEmail.text.toString(), contactPhone.text.toString())
            contactDAO.save(contact)
            finish()

        }
    }

}
