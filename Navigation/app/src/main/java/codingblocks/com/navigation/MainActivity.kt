package codingblocks.com.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        val menuInflater =menuInflater
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.title="Hello"
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean=when(item?.itemId) {
        R.id.firstbutton->{
            val l = Intent(this, Activity2::class.java)
            startActivity(l)
            true
        }
        R.id.secondbutton->{true}

        else ->{
            super.onOptionsItemSelected(item)
        }
    }
}
