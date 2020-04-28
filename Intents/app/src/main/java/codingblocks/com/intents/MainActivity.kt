package codingblocks.com.intents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


val key1="Name"

class MainActivity : AppCompatActivity(), View.OnClickListener {
//    val hashmap:Pair<String,String> = Pair("a","b")



    val btnviews= arrayOfNulls<Button>(5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val btnviews= arrayOf(bt1,bt2,bt3,bt4)
        btnviews[0]=bt1
        btnviews[1]=bt2
        btnviews[2]=bt3
        btnviews[3]=bt4
        btnviews[4]=bt5

        btnviews.forEach {
            it?.setOnClickListener(this)
        }
    }
    override fun onClick(v: View?) {
        //        to open dialpad
        if(v?.id==R.id.bt1) {
//            val k = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${et.text.toString()}"))
            val k = Intent(Intent.ACTION_DIAL, Uri.parse("123456789"))
            startActivity(k)
        }
        // to open a webpage
        if(v?.id==R.id.bt2){
            val j=Intent(Intent.ACTION_VIEW, Uri.parse("http://www.${et.text.toString()}"))
            startActivity(j)
        }

//        To open mail
        if(v?.id==R.id.bt3) {
            val i = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:${et.text.toString()}"))
            i.putExtra(Intent.EXTRA_SUBJECT, "Hello There!")
            i.putExtra(Intent.EXTRA_TEXT, "Hello Noobs!")
            startActivity(Intent.createChooser(i, "Send Email"))
        }
        //       Go to MainActiviy2
        if(v?.id==R.id.bt4) {
            val l = Intent(this, Main2Activity::class.java)
            l.putExtra(key1, et.text.toString())
            startActivity(l)
        }
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

