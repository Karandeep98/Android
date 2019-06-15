package codingblocks.com.intents

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.telecom.ConnectionService
import android.view.View

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        bt10.setOnClickListener(this)
        val name=intent.getStringExtra(key1)
        tv.text=name


}
    override fun onClick(v: View?) {
        startActivity(Intent(this,MainActivity::class.java))
        val connectService=getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if(connectService.activeNetworkInfo.isConnected&&connectService.activeNetworkInfo!=null)
            tv.text="Connected"
        else
            tv.text="NotConnected"
    }
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}