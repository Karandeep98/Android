package codingblocks.com.layouts2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var ll: LinearLayout
    var imageView = arrayOfNulls<ImageView>(4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        ll = LinearLayout(this)
        //using for each loop
        imageView.forEach {
            it?.apply {
                setImageResource(R.drawable.androidimage)
                layoutParams = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                )
                ll.addView(it)
            }
        }

        //using normal loop
        for (i in 0..2)
            imageView[i] = ImageView(this).apply {
            }

    }
}