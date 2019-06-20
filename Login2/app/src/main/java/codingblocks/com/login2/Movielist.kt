package codingblocks.com.login2


import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import kotlinx.android.synthetic.main.movieslist.*
import java.util.ArrayList


class Movielist : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movieslist)
        val pos= intent.getStringExtra("key")

        when(pos){
            "action"->tv.text=tv.text.toString()+pos+" movies:"
            "comedy"->tv.text=tv.text.toString()+pos+" movies:"
            "horror"->tv.text=tv.text.toString()+pos+" movies:"
            "historical"->tv.text=tv.text.toString()+pos+" movies:"
            "adventure"->tv.text=tv.text.toString()+pos+" movies:"
            "drama"->tv.text=tv.text.toString()+pos+" movies:"
            "biopic"->tv.text=tv.text.toString()+pos+" movies:"
            "mystery"->tv.text=tv.text.toString()+pos+" movies:"
            "Science Fiction"->tv.text=tv.text.toString()+pos+" movies:"
        }


    }
}
