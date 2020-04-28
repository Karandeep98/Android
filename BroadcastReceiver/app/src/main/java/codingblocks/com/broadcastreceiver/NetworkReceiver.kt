package codingblocks.com.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class NetworkReceiver :BroadcastReceiver(){
    override fun onReceive(p0: Context?, p1: Intent?) {
        when(p1?.action){
            Intent.ACTION_AIRPLANE_MODE_CHANGED->{
                Toast.makeText(p0,"Airplane mode changed!",Toast.LENGTH_LONG).show()
            }
        }
    }

}