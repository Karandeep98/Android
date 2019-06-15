package codingblocks.com.calculatorkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

//    lateinit var
//    bt0:Button
//    lateinit var bt1:Button
//    lateinit var bt2:Button
//    lateinit var bt3:Button
//    lateinit var bt4:Button
//    lateinit var bt5:Button
//    lateinit var bt6:Button
//    lateinit var bt7:Button
//    lateinit var bt8:Button
//    lateinit var bt9:Button
//    lateinit var btplus:Button
//    lateinit var btminus:Button
//    lateinit var btc:Button
//    lateinit var btdot:Button
//    lateinit var btdiv:Button
//    lateinit var btmul:Button
//    lateinit var et1:EditText
//    lateinit var et2:EditText
//    lateinit var t:TextView
      var a=0f
    var b=0f
    var operator=""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//         bt0 = findViewById(R.id.button0)
//         bt1 = findViewById(R.id.button1)
//         bt2 = findViewById(R.id.button2)
//         bt3 = findViewById(R.id.button3)
//         bt4 = findViewById(R.id.button4)
//         bt5 = findViewById(R.id.button5)
//         bt6 = findViewById(R.id.button6)
//         bt7 = findViewById(R.id.button7)
//         bt8 = findViewById(R.id.button8)
//         bt9 = findViewById(R.id.button9)
//         btplus = findViewById(R.id.buttonplus)
//         btminus = findViewById(R.id.buttonminus)
//         btdiv = findViewById(R.id.buttondivide)
//         btmul = findViewById(R.id.buttonmultiply)
//         btdot = findViewById(R.id.buttondot)
//         btc = findViewById(R.id.buttonclear)
//         et1 = findViewById(R.id.et1)
//         et2 = findViewById(R.id.et2)
//         t = findViewById(R.id.t)


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        button0.setOnClickListener(this)
        buttondot.setOnClickListener(this)
        buttonplus.setOnClickListener(this)
        buttonminus.setOnClickListener(this)
        buttondivide.setOnClickListener(this)
        buttonmultiply.setOnClickListener(this)
        buttonallclear.setOnClickListener(this)
        buttonequal.setOnClickListener(this)
        buttonanswer.setOnClickListener(this)
        buttonclear.setOnClickListener(this)
        nextpage.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
//        if (et1.text.toString() != "" && et2.text.toString() != "") {
//            a = java.lang.Float.parseFloat(et1.text.toString())
//            b = java.lang.Float.parseFloat(et2.text.toString())
//        }


//        if (v!!.id == R.id.button0) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button0.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button0.getText().toString())
//        }
//        if (v.id == R.id.button1) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button1.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button1.getText().toString())
//        }
//        if (v.id == R.id.button2) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button2.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button2.getText().toString())
//        }
//        if (v.id == R.id.button3) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button3.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button3.getText().toString())
//        }
//        if (v.id == R.id.button4) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button4.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button4.getText().toString())
//        }
//
//        if (v.id == R.id.button5) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button5.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button5.getText().toString())
//        }
//        if (v.id == R.id.button6) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button6.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button6.getText().toString())
//        }
//        if (v.id == R.id.button7) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button7.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button7.getText().toString())
//        }
//        if (v.id == R.id.button8) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button8.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button8.getText().toString())
//        }
//        if (v.id == R.id.button9) {
//            if (et1.hasFocus())
//                et1.setText(et1.text.toString() + button9.getText().toString())
//            if (et2.hasFocus())
//                et2.setText(et2.text.toString() + button9.getText().toString())
//        }
        if(v?.id==R.id.button0){
            et1.setText(et1.text.toString() + button0.text.toString())
        }
        if(v?.id==R.id.button1){
            et1.setText(et1.text.toString() + button1.text.toString())
        }
        if(v?.id==R.id.button2){
            et1.setText(et1.text.toString() + button2.text.toString())
        }
        if(v?.id==R.id.button3){
            et1.setText(et1.text.toString() + button3.text.toString())
        }
        if(v?.id==R.id.button4){
            et1.setText(et1.text.toString() + button4.text.toString())
        }
        if(v?.id==R.id.button5){
            et1.setText(et1.text.toString() + button5.text.toString())
        }
        if(v?.id==R.id.button6){
            et1.setText(et1.text.toString() + button6.text.toString())
        }
        if(v?.id==R.id.button7){
            et1.setText(et1.text.toString() + button7.text.toString())
        }
        if(v?.id==R.id.button8){
            et1.setText(et1.text.toString() + button8.text.toString())
        }
        if(v?.id==R.id.button9){
            et1.setText(et1.text.toString() + button9.text.toString())
        }
        if (v?.id == R.id.buttondot) {
            if(!('.' in et1.text))
            et1.setText(et1.text.toString() + buttondot.text.toString())
        }

        if (v?.id == R.id.buttonplus) {
            if (et1.text!= "") {
                a = java.lang.Float.parseFloat(et1.text.toString())
            }
                operator = "+"
                t2.setText(a.toString() + " + ")
                et1.setText("")

        }
//            t.text = (a + b).toString()

        if (v?.id == R.id.buttonminus){
            if(et1.text!="") {
                a = java.lang.Float.parseFloat(et1.text.toString())
            }
            operator="-"
            t2.setText(a.toString()+" - ")
            et1.setText("")
        }
//            t.text = (a - b).toString()
        if (v?.id == R.id.buttondivide){
            if(et1.text!="") {
                a = java.lang.Float.parseFloat(et1.text.toString())
            }
            operator="/"
            t2.setText(a.toString()+" ÷ ")
            et1.setText("")
        }
//            t.text = (a / b).toString()
        if (v?.id == R.id.buttonallclear) {
            t.text = ""
            t2.text = ""
            et1.setText("")
            a=0f
            b=0f
        }

        if (v?.id == R.id.buttonmultiply){
            if(et1.text!="") {
                a = java.lang.Float.parseFloat(et1.text.toString())
            }
            operator="*"
            t2.setText(a.toString()+" X ")
            et1.setText("")
        }
        if(v?.id==R.id.buttonequal){
            if(et1.text!="" && et1.text!=".") {
                b = java.lang.Float.parseFloat(et1.text.toString())
                et1.setText(b.toString())
            }
            when(operator){
                "+"-> t.text = "="+(a + b).toString()
                "-"-> t.text = "="+(a - b).toString()
                "*"-> t.text = "="+(a * b).toString()
                "/"-> t.text = "="+(a / b).toString()
                else->t.text=""
            }
        }
        if(v?.id==R.id.buttonanswer){
            if(t.text!="") {
                et1.text = t.text.substring(1, t.text.length)
            }
        }
        if(v?.id==R.id.buttonclear && et1.text!=""){
            et1.text=et1.text.substring(0,et1.text.length-1)
        }
        if(v?.id==R.id.nextpage){
            val i = Intent(this, Main2Activity::class.java)
            startActivity(i)
        }

//            t.text = (a * b).toString()
    }
}
