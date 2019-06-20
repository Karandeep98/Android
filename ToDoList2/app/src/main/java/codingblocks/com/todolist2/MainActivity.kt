package codingblocks.com.todolist2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var list:ArrayList<String>
    lateinit var adapt: ArrayAdapter<String>
//    lateinit var adapt2:ArrayAdapter<String>
//    var year= arrayOf("2010","2011","2012","2013","2014","2015","2016","2017","2018","2019")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
//        spinner.onItemSelectedListener
        list= ArrayList()
        adapt = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, list)
//        adapt2=ArrayAdapter(this,android.R.layout.simple_spinner_item,year)
//        adapt2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

//        getValues()

    }
    //    fun getValues(){
//        Toast.makeText(this,"spinner1"+spinner.selectedItem.toString(),Toast.LENGTH_LONG).show()
//    }
    override fun onClick(v: View?) {
        if(v?.id==R.id.button){
            list.add(et.text.toString())//+spinner.selectedItem.toString())
            lv.adapter = adapt
//            spinner.adapter=adapt2
//            adapt.notifyDataSetChanged()
            et.setText("")

        }
    }
}

