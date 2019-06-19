package codingblocks.com.asynchronous

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL
import kotlin.random.Random

class SmartActivity : AppCompatActivity() {

    val uiScope= CoroutineScope(Dispatchers.Main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt1.setOnClickListener {
            uiScope.launch {
                for(i in 0..4){
                    delay(1000)
                    tv1.text="$i"
                }
            }
        }
//        uiScope.launch {
//            delay(5000)
//            tv1.text = "After 5 sec"
//        }
//        bt2.setOnClickListener {
//            tv2.text = randomNumber().toString()
//        }
        bt2.setOnClickListener {
            uiScope.launch {
                val result=get("https://www.google.com/search?q=hello&rlz=1C1CHBD_enIN802IN802&oq=he&aqs=chrome.0.69i59j69i57j69i60l4.1310j0j7&sourceid=chrome&ie=UTF-8")
                tv2.text=result
            }
        }
    }
    suspend fun get(urlString:String):String{
        return withContext(Dispatchers.IO){
            val url=URL(urlString)
            val connection=url.openConnection()as HttpURLConnection
            val isr=InputStreamReader(connection.inputStream)
            val bufferReader=BufferedReader(isr)
            val sb=StringBuilder()
            var buffer:String?=""
            while(buffer!=null){
                sb.append(buffer)
                buffer=bufferReader.readLine()
            }
            sb.toString()

        }
    }

//    fun randomNumber()= Random(System.currentTimeMillis()).nextInt()
}
