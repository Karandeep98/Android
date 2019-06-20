package codingblocks.com.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val uiScope = CoroutineScope(Dispatchers.Main)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var stop=0
        var msec=0
        var sec=0
        bt1.setOnClickListener {
            stop=0

            uiScope.launch {
                for (j in sec..59) {
                    for (i in msec..99) {
                        if(stop==1) {
                            break
                        }
                        delay(8.toLong())
                        if(i<10)
                            tv3.text="0"+"$i"
                        else
                            tv3.text="$i"
                    }
                    if(stop==1) {
                        break
                    }
                    if(j<10)
                        tv2.text = "0"+(j.toString().toInt()+1).toString()+"."
                    else
                        tv2.text = (j.toString().toInt()+1).toString()+"."
                    msec=0
                }
            }
        }
        bt2.setOnClickListener {
            stop=1
            bt1.text="resume"
            sec=tv2.text.substring(0,tv2.text.length-1).toInt()
            msec=tv3.text.toString().toInt()
        }
        bt3.setOnClickListener {
            stop=1
            bt1.text="Start"
            tv2.text="00."
            tv3.text="00"
            msec=0
            sec=0
        }
    }
    }
