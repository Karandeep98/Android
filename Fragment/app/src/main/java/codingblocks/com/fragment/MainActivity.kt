package codingblocks.com.fragment

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dcbutton.setOnClickListener {

            val bundle = Bundle()
            val frag = DcFragment()
            bundle.putString("NAME", "DC")

            frag.arguments = bundle
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, frag)
                .commit()
        }
        marvelbutton.setOnClickListener {

            val bundle = Bundle()
            val frag = MarvelFragment()
            bundle.putString("NAME", "MARVEL")

            frag.arguments = bundle
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, frag)
                .commit()
        }
//        Dynamic Fragment
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.container, DcFragment())
//            .commit()

    }

}
