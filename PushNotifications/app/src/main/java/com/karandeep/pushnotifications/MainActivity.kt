package com.karandeep.pushnotifications

import android.app.Dialog
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_layout.*
import kotlinx.android.synthetic.main.addpopup.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)
        toolbar.title = "Road assistant"

        val nm = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            nm.createNotificationChannel(
                NotificationChannel(
                    "first", "default",
                    NotificationManager.IMPORTANCE_DEFAULT
                )
            )
        FirebaseMessaging.getInstance().subscribeToTopic("general")
            .addOnCompleteListener { task ->
                var msg = "Successful!"
                if (!task.isSuccessful) {
                    msg = "Failed!"
                }
//                Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
            }
        nav_view.setNavigationItemSelectedListener(this)
        nav_drawer.setOnClickListener {
            drawer.openDrawer(GravityCompat.START)
        }
            addcontact.setOnClickListener {
                showDialogAdd()
            }
    }
    override fun onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
                super.onBackPressed()
        }
    }
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemId){
            R.id.nav_rewards->{
                val i=Intent(this@MainActivity,RewardsActivity::class.java)
                startActivity(i)
            }
            R.id.nav_emergency->{
                val i=Intent(this@MainActivity,EmergencyActivity::class.java)
                startActivity(i)
            }
            R.id.nav_share->{
                val i=Intent(this@MainActivity,ShareLocation::class.java)
                startActivity(i)
            }
            R.id.emergencyCall->{
                val i=Intent(this@MainActivity,EmergencyCall::class.java)
                startActivity(i)
            }
            R.id.nav_contact->{
                val i=Intent(this@MainActivity,TextToSpeech::class.java)
                startActivity(i)
            }
            R.id.nav_about->{
                val i=Intent(this@MainActivity,SpeechToText::class.java)
                startActivity(i)
            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
    fun showDialogAdd() {
        val dialogadd = Dialog(this@MainActivity)
        dialogadd.setContentView(R.layout.addpopup)
        //        dialogadd.setCanceledOnTouchOutside(false);
        dialogadd.addtv.setOnClickListener {
            newcontact.visibility=View.VISIBLE
            dialogadd.cancel()
        }
        dialogadd.show()
    }

//    override fun onNavDrawerOpen() {
//        drawer.openDrawer(GravityCompat.START)
//    }
}
