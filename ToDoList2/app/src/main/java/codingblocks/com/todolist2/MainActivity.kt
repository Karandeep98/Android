package codingblocks.com.todolist2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<String>
//    lateinit var adapt: ArrayAdapter<String>
    //    lateinit var adapt2:ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val year = arrayOf("2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019")
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, year)
        list = ArrayList()
//        var spintext=""
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(applicationContext, "Please select an option", Toast.LENGTH_LONG).show()
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                tv.text = year[position]
            }

        }
        button.setOnClickListener {
            lv.adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, list)

            list.add(et.text.toString()+"("+tv.text.toString()+")")
            et.setText("")
        }
    }
}

