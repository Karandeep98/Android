package codingblocks.com.room

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.listdetails.view.*

class MainActivity : AppCompatActivity() {

    val db by lazy {
        Room.databaseBuilder(this,AppDatabase::class.java,"todo.db")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list=db.tododao().getalltask() as ArrayList<Todo>
        val adapter=TaskAdapter(list,this)
        lv.adapter=adapter
        adapter.todoItemClick=object :TodoItemClickListner{
            override fun onclick(task:Todo, position: Int) {
                db.tododao().deletetask(task)
                list=db.tododao().getalltask() as ArrayList<Todo>
                adapter.updateTasks(list)
            }
            override fun oncheck(task: Todo, position: Int) {
                db.tododao().updatecheck(Todo(id = task.id,task = task.task,status = !task.status))
                list=db.tododao().getalltask() as ArrayList<Todo>
                adapter.updateTasks(list)
            }

            override fun updateText(task: Todo,position: Int) {
                db.tododao().updateTask(Todo(id=task.id,task=et.text.toString(),status = false))
                list=db.tododao().getalltask() as ArrayList<Todo>
                adapter.updateTasks(list)
                et.setText("")

            }
        }
        button.setOnClickListener {
            db.tododao().insert(Todo(task=et.text.toString(),status = false))
            list=db.tododao().getalltask() as ArrayList<Todo>
            adapter.updateTasks(list)
            et.setText("")
        }
        sortbutton.setOnClickListener {
//         lateinit var newlist : ArrayList<Todo>
//            for(i in 0 until list.size) {
                 list = db.tododao().getalldonetask() as ArrayList<Todo>
//            }
            adapter.updateTasks(list)
        }

    }

}
