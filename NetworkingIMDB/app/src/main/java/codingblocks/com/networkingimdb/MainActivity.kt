package codingblocks.com.networkingimdb

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getdata.setOnClickListener {
            updateTextView()
        }
    }
    val userList = arrayListOf<GithubUser>()

    fun updateTextView() {
        val networkTask = NetworkTask()
        networkTask.execute(
            "https://jsonplaceholder.typicode.com/users",
            "https://api.github.com/search/users?q=karandeep",
            "https://www.omdbapi.com/?i=tt3896198&apikey=74570384",
            "https://api.themoviedb.org/3/movie/550?api_key=b315d3231fba4b90ca67901413855fb7"
        )
    }
    inner class NetworkTask : AsyncTask<String, Int, String>() {
        override fun doInBackground(vararg url: String?): String? {
            val googleUrl = URL(url[1])
            val connection = googleUrl.openConnection() as HttpURLConnection
            val isr = InputStreamReader(connection.inputStream)
            val bufferReader = BufferedReader(isr)
            val sb = StringBuilder()
            var buffer: String? = ""
            while (buffer != null) {
                sb.append(buffer)
                buffer = bufferReader.readLine()
            }
            return sb.toString()
        }

        override fun onPostExecute(result: String?) {
            val user = Gson().fromJson(result, Github::class.java)
            Log.i("user", user.toString())
            Log.i("user-items", user.items.toString())
            userList.addAll(user.items)

            rview.layoutManager = LinearLayoutManager(this@MainActivity)
            rview.adapter = GithubAdapter(this@MainActivity, userList)
        }
    }
}
