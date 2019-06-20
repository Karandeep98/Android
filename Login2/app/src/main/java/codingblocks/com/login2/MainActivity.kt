package codingblocks.com.login2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val prefs = getPreferences(Context.MODE_PRIVATE)
        btsignup.setOnClickListener {

            prefs.edit {
                putString("Username", username.text.toString())
                putString("Password", password.text.toString())
            }
            val i=Intent(this,Activity2::class.java)
            startActivity(i)

        }
        btsignin.setOnClickListener {
            username.setText(prefs.getString("Username", ""))
            password.setText(prefs.getString("Password", ""))
            val l = Intent(this, Movielist::class.java)
//            l.putExtra(key1, et.text.toString())
            startActivity(l)
        }
    }
}

