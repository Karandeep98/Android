package codingblocks.com.dialogbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt.setOnClickListener {
            AlertDialog.Builder(this).setTitle("Alert!!").
                setMessage("Do you want to remove this item from cart?").
                setCancelable(false)
                .setPositiveButton("yes") { _, _ ->
                    tv.text="Access Granted!"
//                    finish()
                }.setNegativeButton("No") { dialog, id ->
                    tv.text="Access Denied!"
                    dialog.cancel()
            }.show()

        }
    }
}