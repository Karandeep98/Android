package codingblocks.com.tictactoe

import android.graphics.Color.rgb
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var count=0
    var gameEnd=0
    var latest=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonreset.setOnClickListener(this)
        buttonundo.setOnClickListener(this)
        button1.setBackgroundColor(rgb(216, 207, 162))
        button2.setBackgroundColor(rgb(216, 207, 162))
        button3.setBackgroundColor(rgb(216, 207, 162))
        button4.setBackgroundColor(rgb(216, 207, 162))
        button5.setBackgroundColor(rgb(216, 207, 162))
        button6.setBackgroundColor(rgb(216, 207, 162))
        button7.setBackgroundColor(rgb(216, 207, 162))
        button8.setBackgroundColor(rgb(216, 207, 162))
        button9.setBackgroundColor(rgb(216, 207, 162))

    }
    fun condition(){
        if(button1.text=="0"&&button2.text=="0"&&button3.text=="0"){
            Toast.makeText(this,"Player 0 won!!",Toast.LENGTH_LONG).show()
            button1.setBackgroundColor(rgb(26, 219, 48))
            button2.setBackgroundColor(rgb(26, 219, 48))
            button3.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button4.text=="0"&&button5.text=="0"&&button6.text=="0"){
            Toast.makeText(this,"Player 0 won!!",Toast.LENGTH_LONG).show()
            button4.setBackgroundColor(rgb(26, 219, 48))
            button5.setBackgroundColor(rgb(26, 219, 48))
            button6.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button7.text=="0"&&button8.text=="0"&&button9.text=="0"){
            Toast.makeText(this,"Player 0 won!!",Toast.LENGTH_LONG).show()
            button7.setBackgroundColor(rgb(26, 219, 48))
            button8.setBackgroundColor(rgb(26, 219, 48))
            button9.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button1.text=="X"&&button2.text=="X"&&button3.text=="X"){
            Toast.makeText(this,"Player X won!!",Toast.LENGTH_LONG).show()
            button1.setBackgroundColor(rgb(26, 219, 48))
            button2.setBackgroundColor(rgb(26, 219, 48))
            button3.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button4.text=="X"&&button5.text=="X"&&button6.text=="X"){
            Toast.makeText(this,"Player X won!!",Toast.LENGTH_LONG).show()
            button4.setBackgroundColor(rgb(26, 219, 48))
            button5.setBackgroundColor(rgb(26, 219, 48))
            button6.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button7.text=="X"&&button8.text=="X"&&button9.text=="X"){
            Toast.makeText(this,"Player X won!!",Toast.LENGTH_LONG).show()
            button7.setBackgroundColor(rgb(26, 219, 48))
            button8.setBackgroundColor(rgb(26, 219, 48))
            button9.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button1.text=="0"&&button4.text=="0"&&button7.text=="0"){
            Toast.makeText(this,"Player 0 won!!",Toast.LENGTH_LONG).show()
            button1.setBackgroundColor(rgb(26, 219, 48))
            button4.setBackgroundColor(rgb(26, 219, 48))
            button7.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button2.text=="0"&&button5.text=="0"&&button8.text=="0"){
            Toast.makeText(this,"Player 0 won!!",Toast.LENGTH_LONG).show()
            button2.setBackgroundColor(rgb(26, 219, 48))
            button5.setBackgroundColor(rgb(26, 219, 48))
            button8.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button3.text=="0"&&button6.text=="0"&&button9.text=="0"){
            Toast.makeText(this,"Player 0 won!!",Toast.LENGTH_LONG).show()
            button3.setBackgroundColor(rgb(26, 219, 48))
            button6.setBackgroundColor(rgb(26, 219, 48))
            button9.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button1.text=="X"&&button4.text=="X"&&button7.text=="X"){
            Toast.makeText(this,"Player X won!!",Toast.LENGTH_LONG).show()
            button1.setBackgroundColor(rgb(26, 219, 48))
            button4.setBackgroundColor(rgb(26, 219, 48))
            button7.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button2.text=="X"&&button5.text=="X"&&button8.text=="X"){
            Toast.makeText(this,"Player X won!!",Toast.LENGTH_LONG).show()
            button2.setBackgroundColor(rgb(26, 219, 48))
            button5.setBackgroundColor(rgb(26, 219, 48))
            button8.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button3.text=="X"&&button6.text=="X"&&button9.text=="X"){
            Toast.makeText(this,"Player X won!!",Toast.LENGTH_LONG).show()
            button3.setBackgroundColor(rgb(26, 219, 48))
            button6.setBackgroundColor(rgb(26, 219, 48))
            button9.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button1.text=="0"&&button5.text=="0"&&button9.text=="0"){
            Toast.makeText(this,"Player 0 won!!",Toast.LENGTH_LONG).show()
            button1.setBackgroundColor(rgb(26, 219, 48))
            button5.setBackgroundColor(rgb(26, 219, 48))
            button9.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button3.text=="0"&&button5.text=="0"&&button7.text=="0"){
            Toast.makeText(this,"Player 0 won!!",Toast.LENGTH_LONG).show()
            button3.setBackgroundColor(rgb(26, 219, 48))
            button5.setBackgroundColor(rgb(26, 219, 48))
            button7.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button1.text=="X"&&button5.text=="X"&&button9.text=="X"){
            Toast.makeText(this,"Player X won!!",Toast.LENGTH_LONG).show()
            button1.setBackgroundColor(rgb(26, 219, 48))
            button5.setBackgroundColor(rgb(26, 219, 48))
            button9.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        if(button3.text=="X"&&button5.text=="X"&&button7.text=="X"){
            Toast.makeText(this,"Player X won!!",Toast.LENGTH_LONG).show()
            button3.setBackgroundColor(rgb(26, 219, 48))
            button5.setBackgroundColor(rgb(26, 219, 48))
            button7.setBackgroundColor(rgb(26, 219, 48))
            gameEnd=1
        }
        else if(button1.text!="" && button2.text!="" && button3.text!="" && button4.text!=""
                && button5.text!="" && button6.text!="" && button7.text!="" && button8.text!=""
             && button9.text!=""&&gameEnd==0){
            Toast.makeText(this,"Match Draw!!",Toast.LENGTH_LONG).show()
            gameEnd=1
        }

    }
    override fun onClick(v: View?) {

        if(v?.id==R.id.buttonreset){
            button1.text = ""
            button2.text = ""
            button3.text=""
            button4.text=""
            button5.text=""
            button6.text=""
            button7.text=""
            button8.text=""
            button9.text=""
            button1.setBackgroundColor(rgb(216, 207, 162))
            button2.setBackgroundColor(rgb(216, 207, 162))
            button3.setBackgroundColor(rgb(216, 207, 162))
            button4.setBackgroundColor(rgb(216, 207, 162))
            button5.setBackgroundColor(rgb(216, 207, 162))
            button6.setBackgroundColor(rgb(216, 207, 162))
            button7.setBackgroundColor(rgb(216, 207, 162))
            button8.setBackgroundColor(rgb(216, 207, 162))
            button9.setBackgroundColor(rgb(216, 207, 162))
            gameEnd=0
        }
        if(gameEnd==0) {
            if(v?.id==R.id.buttonundo){
                when(latest){
                    "1"->button1.text=""
                    "2"->button2.text=""
                    "3"->button3.text=""
                    "4"->button4.text=""
                    "5"->button5.text=""
                    "6"->button6.text=""
                    "7"->button7.text=""
                    "8"->button8.text=""
                    "9"->button9.text=""

                }
                count++

            }
            if (v?.id == R.id.button1 && button1.text=="") {

                if (count % 2 == 0)
                    button1.text = "0"
                else
                    button1.text = "X"
                count++
                latest="1"
            }
            if (v?.id == R.id.button2&& button2.text=="") {

                if (count % 2 == 0)
                    button2.text = "0"
                else
                    button2.text = "X"
                count++
                latest="2"
            }
            if (v?.id == R.id.button3&& button3.text=="") {

                if (count % 2 == 0)
                    button3.text = "0"
                else
                    button3.text = "X"
                count++
                latest="3"
            }
            if (v?.id == R.id.button4&& button4.text=="") {

                if (count % 2 == 0)
                    button4.text = "0"
                else
                    button4.text = "X"
                count++
                latest="4"
            }
            if (v?.id == R.id.button5&& button5.text=="") {

                if (count % 2 == 0)
                    button5.text = "0"
                else
                    button5.text = "X"
                count++
                latest="5"
            }
            if (v?.id == R.id.button6&& button6.text=="") {

                if (count % 2 == 0)
                    button6.text = "0"
                else
                    button6.text = "X"
                count++
                latest="6"
            }
            if (v?.id == R.id.button7&& button7.text=="") {

                if (count % 2 == 0)
                    button7.text = "0"
                else
                    button7.text = "X"
                count++
                latest="7"
            }
            if (v?.id == R.id.button8&& button8.text=="") {

                if (count % 2 == 0)
                    button8.text = "0"
                else
                    button8.text = "X"
                count++
                latest="8"
            }
            if (v?.id == R.id.button9&& button9.text=="") {

                if (count % 2 == 0)
                    button9.text = "0"
                else
                    button9.text = "X"
                count++
                latest="9"
            }
            condition()
        }

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
