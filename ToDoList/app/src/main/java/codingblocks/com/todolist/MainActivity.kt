package codingblocks.com.todolist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var list:ArrayList<String>
    lateinit var adapt:ArrayAdapter<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
        list= ArrayList()
        adapt = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, list)


    }
    override fun onClick(v: View?) {
        if(v?.id==R.id.button){
            list.add(et.text.toString())
            lv.adapter = adapt
//            adapt.notifyDataSetChanged()
            et.setText("")

        }
    }
}
