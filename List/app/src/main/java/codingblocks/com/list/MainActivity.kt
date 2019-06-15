package codingblocks.com.list

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var movies = arrayOf("Thor", "Captain America", "Hulk", "Infinity War", "Iron Man",
            "Black Panther", "Spider Man")
    var images = arrayOf(R.drawable.thor, R.drawable.cap, R.drawable.hulk2,
            R.drawable.avenger, R.drawable.ironman, R.drawable.blackpanther, R.drawable.spider)
    var actors = arrayOf("Loki", "Steve Rogers", "Banner", "Thanos", "Tony Stark",
            "King Of Waganda", "Peter Parker")
    var yearOfRelease = arrayOf("2010", "2011", "2012", "2013", "2014", "2015",
            "2016", "2017")
    var list: ArrayList<Movie> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Android Adapter
//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, movies)
//        listview.adapter = adapter
        for(i in movies.indices){
            list.add(Movie(movieName=movies[i],actorName=actors[i],imageName = images[i],
                    yearOfRelease = yearOfRelease[i]))

        }
//        Custom Adapter
//        Log.i("Tag",list.size.toString())  //This is optional,it send the size of list in
//                                              logcat
        val adapter=MoviesAdapter(list,this)
        listview.adapter=adapter
        val context=this
        listview.setOnItemClickListener{ parent, view, position, id ->
            val selectedMovie=movies[position]
//            val detail=DetailMovies.newIntent(context,selectedMovie)

        val detail=Intent(this,DetailMovies::class.java)
            startActivity(detail)
        }
    }
    }
