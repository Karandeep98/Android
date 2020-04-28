package codingblocks.com.unittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calfare.setOnClickListener {
            var distance=etdistance.text.toString().toFloat()
            var time=ettime.text.toString().toFloat()
            var fare=60+(distance*10)+time
            tvfare.text= "Rs "+fare.toString()
        }
    }
}
