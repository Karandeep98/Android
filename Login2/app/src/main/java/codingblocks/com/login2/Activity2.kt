package codingblocks.com.login2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.provider.Settings.Global.putString
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val name= PreferenceManager.getDefaultSharedPreferences(this).getString("Name","")

        tv.text=tv.text.toString()+name
        action.setOnClickListener(this)
        comedy.setOnClickListener(this)
        horror.setOnClickListener(this)
        historical.setOnClickListener(this)
        adventure.setOnClickListener(this)
        drama.setOnClickListener(this)
        biopic.setOnClickListener(this)
        mystery.setOnClickListener(this)
        science.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        if(v?.id==R.id.action){
            val l = Intent(this, Movielist::class.java)
            l.putExtra("key", "action")
            startActivity(l)
        }
        if(v?.id==R.id.comedy){
            val l = Intent(this, Movielist::class.java)
            l.putExtra("key", "comedy")
            startActivity(l)
        }
        if(v?.id==R.id.horror){
            val l = Intent(this, Movielist::class.java)
            l.putExtra("key", "horror")
            startActivity(l)
        }
        if(v?.id==R.id.historical){
            val l = Intent(this, Movielist::class.java)
            l.putExtra("key", "historical")
            startActivity(l)
        }
        if(v?.id==R.id.adventure){
            val l = Intent(this, Movielist::class.java)
            l.putExtra("key", "adventure")
            startActivity(l)
        }
        if(v?.id==R.id.drama){
            val l = Intent(this, Movielist::class.java)
            l.putExtra("key", "drama")
            startActivity(l)
        }
        if(v?.id==R.id.biopic){
            val l = Intent(this, Movielist::class.java)
            l.putExtra("key", "biopic")
            startActivity(l)
        }
        if(v?.id==R.id.mystery){
            val l = Intent(this, Movielist::class.java)
            l.putExtra("key", "mystery")
            startActivity(l)
        }
        if(v?.id==R.id.science){
            val l = Intent(this, Movielist::class.java)
            l.putExtra("key", "Science Fiction")
            startActivity(l)
        }
    }

}
