package com.karandeep.pushnotifications

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val prefs= PreferenceManager.getDefaultSharedPreferences(this)
        done.setOnClickListener {
            if(name.text.toString()==""){
                Toast.makeText(this,"Name can't be empty", Toast.LENGTH_LONG).show()
            }
            else if(username.text.toString()==""){
                Toast.makeText(this,"Username can't be empty", Toast.LENGTH_LONG).show()
            }
            else if(password.text.toString()==""||confirmpassword.text.toString()==""){
                Toast.makeText(this,"Password can't be empty", Toast.LENGTH_LONG).show()
            }
            else if(password.text.toString()!=confirmpassword.text.toString()){
                Toast.makeText(this,"Password doesn't match!!", Toast.LENGTH_LONG).show()
            }
            else{
                prefs.edit {
                    putString("Username", username.text.toString())
                    putString("Password", password.text.toString())
                    putString("Name",name.text.toString())

                }
                val l = Intent(this, Activity2::class.java)
                startActivity(l)
            }
        }

    }
}
