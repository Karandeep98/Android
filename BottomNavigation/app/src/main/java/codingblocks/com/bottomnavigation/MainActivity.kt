package codingblocks.com.bottomnavigation

import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val navView: BottomNavigationView = findViewById(R.id.nav_view)
//
//        textMessage = findViewById(R.id.message)
        nav_view.setOnNavigationItemSelectedListener(this)
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean =when (item.itemId) {
            R.id.navigation_home -> {
//                textMessage.setText(R.string.title_home)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container,BlankFragment()).commit()
                true
            }
            R.id.navigation_dashboard -> {
//                textMessage.setText(R.string.title_dashboard)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container,BlankFragment2()).commit()
                true
            }
            R.id.navigation_notifications -> {
//                textMessage.setText(R.string.title_notifications)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container,BlankFragment3()).commit()
                true
            }
        else->false
        }
    }

