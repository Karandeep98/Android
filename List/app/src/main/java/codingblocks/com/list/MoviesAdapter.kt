package codingblocks.com.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_movies.view.*

class MoviesAdapter(val movies:ArrayList<Movie>?,val context  :Context):BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    val inflater = LayoutInflater.from(context)
    val view=inflater.inflate(R.layout.item_movies,parent,false)
        val actornameview=view.actorname
        val nameview=view.moviename
        val image=view.img

        nameview.text= movies!![position].movieName+"("+movies[position].yearOfRelease+")"
        actornameview.text=movies[position].actorName
        image.setImageResource(movies[position].imageName)
        return view
    }

    override fun getItem(position: Int): Movie {

    return movies?.get(position)!!
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    return movies?.size ?:0
    }
}