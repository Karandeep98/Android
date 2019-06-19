package codingblocks.com.asynchronous

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Synchronous
//        bt1.setOnClickListener {
//            waitNSec(10)
//            tv1.text = "After 10 seconds"
//        }
        //        Asynchronous

        bt1.setOnClickListener {
            var count =et.text.toString().toInt()
//            Handler().postDelayed(
//                {
//                    tv1.text="After "+count+"sec wait!"
//                },count
//            )
            val timertask=TimerTask()
            timertask.execute(count)
        }

        bt2.setOnClickListener {

            tv2.text = randomNumber().toString()
        }




    }
    fun waitNSec(n:Int){
        val start=System.currentTimeMillis()
        while (System.currentTimeMillis()<(start+n*1000));
    }
    fun randomNumber()=Random(System.currentTimeMillis()).nextInt()


    inner class TimerTask:AsyncTask<Int,Int,Unit>(){
        override fun doInBackground(vararg p0: Int?) {
            val n=p0[0]
//            waitNSec(n?:0)
//                Log.d("Tag","After 10 sec")
            n?.let{
                for(i in 0..n){
                    waitNSec(1)
                    publishProgress(i)
                }
            }
        }
        override fun onPreExecute() {
            super.onPreExecute()
            tv3.text="On Pre Execute"
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            val n=values[0]?:0
            tv1.text="$n"
        }

        override fun onPostExecute(result: Unit?) {
            super.onPostExecute(result)
            tv3.text="On post execute"
        }
    }
}
