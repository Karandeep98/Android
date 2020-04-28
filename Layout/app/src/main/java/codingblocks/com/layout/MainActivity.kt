package codingblocks.com.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //        setContentView(R.layout.activity_main)

        var ll = LinearLayout(this)
        ll.orientation = LinearLayout.VERTICAL
        var imageView = arrayOfNulls<ImageView>(4)
        setContentView(ll)
        //using for each loop
        //using normal loop
//        imageView = Array(4){
//            ImageView(this)
//        }

        for (i in 0..3) {
            imageView[i] = ImageView(this)
        }

        imageView.forEach {

            it?.apply {
//                ImageView(this@MainActivity)
                setImageResource(R.drawable.androidimage)
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                ll.addView(it)
            }
        }




    }
}
