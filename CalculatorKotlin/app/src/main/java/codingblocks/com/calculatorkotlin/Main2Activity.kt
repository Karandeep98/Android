package codingblocks.com.calculatorkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity: AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button9.setOnClickListener(this)
        button8.setOnClickListener(this)
        button7.setOnClickListener(this)
        button6.setOnClickListener(this)
        button5.setOnClickListener(this)
        button4.setOnClickListener(this)
        button3.setOnClickListener(this)
        button2.setOnClickListener(this)
        button1.setOnClickListener(this)
        button0.setOnClickListener(this)
        buttonac.setOnClickListener(this)
        buttonc.setOnClickListener(this)
        buttondot.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if(v?.id==R.id.button0){
            tv1.text=tv1.text.toString()+"0"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.button1){
            tv1.text=tv1.text.toString()+"1"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.button2){
            tv1.text=tv1.text.toString()+"2"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.button3){
            tv1.text=tv1.text.toString()+"3"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.button4){
            tv1.text=tv1.text.toString()+"4"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.button5){
            tv1.text=tv1.text.toString()+"5"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.button6){
            tv1.text=tv1.text.toString()+"6"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.button7){
            tv1.text=tv1.text.toString()+"7"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.button8){
            tv1.text=tv1.text.toString()+"8"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.button9){
            tv1.text=tv1.text.toString()+"9"
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.buttondot){
            tv1.text=tv1.text.toString()+"."
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.buttonc){
            tv1.text=tv1.text.substring(0,tv1.text.length-1)
            tv2.text= (java.lang.Float.parseFloat(tv1.text.toString())*0.014).toString()
        }
        if(v?.id==R.id.buttonac){
            tv1.text=""
            tv2.text= ""
        }
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}