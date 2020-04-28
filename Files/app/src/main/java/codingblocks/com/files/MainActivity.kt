package codingblocks.com.files

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Files","Files dir${getExternalFilesDir(Environment.getDataDirectory().absolutePath)}")
//        val file=File(filesDir,"myfile.txt")
        val file=File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),"myfile.txt")
        btn.setOnClickListener {
//          file.writeText(et.text.toString())
            file.appendText(et.text.toString())
            et.setText("")
            Log.i("Files","exists=${file.exists()}")

        }
        restorebtn.setOnClickListener {
            val exist=file.readText()
            et.setText(exist)
        }
    }
}
