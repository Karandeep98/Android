package codingblocks.com.notifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nm = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            nm.createNotificationChannel(
                NotificationChannel(
                    "first", "default",
                    NotificationManager.IMPORTANCE_DEFAULT
                )
            )

        bt1.setOnClickListener {
            val i=Intent(this,MainActivity::class.java)
            val pi=PendingIntent.getActivity(this,1,i,PendingIntent.FLAG_UPDATE_CURRENT)
            val simplenotification = NotificationCompat.Builder(this, "first")
                .setContentTitle("Simple title")
                .setContentText("This is a simple description of a  2nd notification!")
                .setSmallIcon(R.drawable.ic_notifications_none_black_24dp)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pi)
                .setAutoCancel(true)
//                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .build()

            nm.notify(System.currentTimeMillis().toInt()+5000, simplenotification)
        }
        bt2.setOnClickListener {
            val i =Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("https://www.google.com")
            val pi=PendingIntent.getActivity(this,123,i,PendingIntent.FLAG_UPDATE_CURRENT)
            val simplenotification = NotificationCompat.Builder(this, "first")
                .setContentTitle("Simple title")
                .setContentText("This is a simple description of a  2nd notification!")
                .setContentIntent(pi)
//                .setOngoing(true)//to make the notification unremovable
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.ic_notifications_active_black_24dp)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .build()
            nm.notify(System.currentTimeMillis().toInt(), simplenotification)
        }
        bt3.setOnClickListener {
            val i =Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("https://www.google.com")
            val pi=PendingIntent.getActivity(this,123,i,PendingIntent.FLAG_UPDATE_CURRENT)
            val simplenotification = NotificationCompat.Builder(this, "first")
                .setContentTitle("Simple title")
                .setContentText("This is a simple description of a  2nd notification!")
                .addAction(R.drawable.ic_launcher_foreground,"Click Me!",pi)
//                .setOngoing(true)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .build()
            nm.notify(System.currentTimeMillis().toInt(), simplenotification)
        }
    }
}
