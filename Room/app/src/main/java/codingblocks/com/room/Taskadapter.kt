package codingblocks.com.room

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.listdetails.view.*

class TaskAdapter(var tasks: ArrayList<Todo>,val context: Context) : BaseAdapter(

) {
    var todoItemClick:TodoItemClickListner?= null
    fun updateTasks(newTasks: ArrayList<Todo>) {
        tasks.clear()
        tasks.addAll(newTasks)
        notifyDataSetChanged()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//            val li = parent!!.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//            val view = li.inflate(android.R.layout.simple_list_item_1, parent, false)
//            view.findViewById<TextView>(android.R.id.text1).text = getItem(position).task
        val inflater= LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.listdetails,parent,false)
        val listtext=view.tv
        val check=view.cb
        listtext.text=tasks[position].task
        check.isChecked = tasks[position].status
        view.deletebtn.setOnClickListener {
            todoItemClick?.onclick(getItem(position),position)

        }
        view.cb.setOnClickListener {
            todoItemClick?.oncheck(getItem(position),position)
        }
        view.tv.setOnClickListener {
            todoItemClick?.updateText(getItem(position),position)
        }
        return view
    }

    override fun getItem(position: Int): Todo = tasks[position]

    override fun getItemId(position: Int): Long = 0

    override fun getCount(): Int = tasks.size

}