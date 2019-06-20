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
            "action"-> {
                tv.text = tv.text.toString() + pos + " movies:"
                var id = R.drawable.action
                img.setImageResource(id)
            }
            "comedy"-> {
                tv.text = tv.text.toString() + pos + " movies:"
                var id = R.drawable.comedy
                img.setImageResource(id)
            }
            "horror"-> {
                tv.text = tv.text.toString() + pos + " movies:"
                var id = R.drawable.horror
                img.setImageResource(id)
            }
            "historical"-> {
                tv.text = tv.text.toString() + pos + " movies:"
                var id = R.drawable.history
                img.setImageResource(id)
            }
            "adventure"-> {
                tv.text = tv.text.toString() + pos + " movies:"
                var id = R.drawable.adventure
                img.setImageResource(id)
            }
            "drama"->{
                tv.text=tv.text.toString()+pos+" movies:"
                var id = R.drawable.drama
                img.setImageResource(id)
            }
            "biopic"->{
                tv.text=tv.text.toString()+pos+" movies:"
                var id = R.drawable.biopic
                img.setImageResource(id)
            }
            "mystery"->{
                tv.text=tv.text.toString()+pos+" movies:"
                var id = R.drawable.mystery
                img.setImageResource(id)
            }
            "Science Fiction"->{
                tv.text=tv.text.toString()+pos+" movies:"
                var id = R.drawable.science
                img.setImageResource(id)
            }
        }


    }
}
