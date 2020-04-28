package com.karandeep.pushnotifications

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val name= PreferenceManager.getDefaultSharedPreferences(this).getString("Name","")

        tv.text=tv.text.toString()+name+"\nYou have registered Succesfully"
        nextbt.setOnClickListener {
            val i=Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}
