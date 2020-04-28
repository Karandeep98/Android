package codingblocks.com.backpressed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.GlobalScope

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private var doubleBackPressed = false
        override fun onBackPressed() {
            if (doubleBackPressed) {
                super.onBackPressed()
            }
            else {
                doubleBackPressed = true
                Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
                GlobalScope.launch {
                    delay(2000)
                    doubleBackPressed = false
                }
            }
        }


}
