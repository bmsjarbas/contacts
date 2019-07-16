package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fabNewContact = findViewById<FloatingActionButton>(R.id.new_contact_fab_main_activity)
        fabNewContact.setOnClickListener { startActivity(Intent(this, NewContactForm::class.java)) }


    }

    override fun onResume() {
        super.onResume()
        val contactDAO = ContactDAO()
        val contactList = findViewById<ListView>(R.id.contact_list_main_activity)
        contactList.adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, contactDAO.getAll())
    }
}
