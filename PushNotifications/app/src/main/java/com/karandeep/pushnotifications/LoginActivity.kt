package com.karandeep.pushnotifications

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val uname= PreferenceManager.getDefaultSharedPreferences(this).getString("Username","")
        val pword= PreferenceManager.getDefaultSharedPreferences(this).getString("Password","")
        btsignup.setOnClickListener {
            val i= Intent(this,SignUpActivity::class.java)
            startActivity(i)

        }
        btsignin.setOnClickListener {
            if (username.text.toString() == "") {
                Toast.makeText(this, "Username can't be empty", Toast.LENGTH_LONG).show()
            } else if (password.text.toString() == "") {
                Toast.makeText(this, "Password can't be empty", Toast.LENGTH_LONG).show()
            } else {
                Log.i("uinput",username.text.toString())
                Log.i("pinput",password.text.toString())
                Log.i("uname",uname)
                Log.i("pword",pword)

                if(username.text.toString() == uname
                    && password.text.toString() ==pword){
                    val l = Intent(this, Activity2::class.java)
                    startActivity(l)
                }
                else {
//                username.setText(prefs.getString("Username", ""))
//                password.setText(prefs.getString("Password", ""))
                    Toast.makeText(this, "Username/Password is Invalid!!", Toast.LENGTH_LONG).show()
//            l.putExtra("key1", et.text.toString())
                }
            }
        }
    }
}
