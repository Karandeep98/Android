package codingblocks.com.youtubeplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : YouTubeBaseActivity() {
val apikey="AIzaSyBEKZxQX5xLB3ZM6kFhcjBsvGWxBGRfSvs"
    val path="Nt9L1jCKGnE"
//    val path="7fd982WMw1o"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        player.initialize(apikey,
            object : YouTubePlayer.OnInitializedListener {
                override fun onInitializationSuccess(provider: YouTubePlayer.Provider,
                    youTubePlayer: YouTubePlayer, b: Boolean) {
                    if(!b){
                        youTubePlayer.loadVideo(path)
                        youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT)
                    }
                }

                override fun onInitializationFailure(provider: YouTubePlayer.Provider,
                    youTubeInitializationResult: YouTubeInitializationResult) {
Toast.makeText(this@MainActivity,youTubeInitializationResult.toString(),Toast.LENGTH_LONG).show()
                }
            })
    }
}
