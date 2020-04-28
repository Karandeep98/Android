package codingblocks.com.firebasedb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Date
import java.sql.Time

class MainActivity : AppCompatActivity() {
val db by lazy{
    FirebaseDatabase.getInstance().reference
}
//    val auth by lazy{
//        FirebaseAuth.getInstance()
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var uid=auth.uid
//        auth.addAuthStateListener {
//            if(it.currentUser==null){
//                auth.signInWithEmailAndPassword("karandeep041998@gmail.com","123456")
//            }
//            else{
//                 uid=it.uid
//
//                Toast.makeText(this,"${it.uid}",Toast.LENGTH_LONG).show()
//            }
//        }
        val ref = db.child("messages/user1")
        db.child("messages")
            .child("user1")
            .child("chat1")
//            .child("text")
            .addValueEventListener(object :ValueEventListener{
                override fun onCancelled(p0: DatabaseError) {

                         }

                override fun onDataChange(snapshot: DataSnapshot) {
                    tv.text= snapshot.getValue(Todo::class.java)?.text
                    val todo = Todo()
                    todo.text = et.text.toString()
                    todo.time = Date(System.currentTimeMillis()).toString() +" "+Time(System.currentTimeMillis()).toString()


                }
            }
            )
            db.addChildEventListener(object :ChildEventListener{
                override fun onCancelled(p0: DatabaseError) {

                }

                override fun onChildMoved(p0: DataSnapshot, p1: String?) {
                }

                override fun onChildChanged(snapshot: DataSnapshot, p1: String?) {
//                    tv.text="${tv.text} ${snapshot.getValue(Todo::class.java)?.text}"
                }

                override fun onChildAdded(snapshot: DataSnapshot, p1: String?) {
                tv.text="${tv.text} ${snapshot.getValue(Todo::class.java)?.text}"
                    //to obtain the key from json
//                    snapshot.key
                }

                override fun onChildRemoved(p0: DataSnapshot) {
                }

            }
            )

        bt.setOnClickListener {
                val todo = Todo()
                todo.text = et.text.toString()
//                todo.time = System.currentTimeMillis().toString()
            todo.time = Date(System.currentTimeMillis()).toString() +" "+Time(System.currentTimeMillis()).toString()


//                val key = ref.push().key
            val key=et2.text.toString()
                ref.child(key).setValue(todo)

        }
//            db.addValueEventListener(object:ValueEventListener{
//                override fun onCancelled(p0: DatabaseError) {
//                     }
//
//                override fun onDataChange(snapshot: DataSnapshot) {
//                  tv.text= snapshot.getValue(Todo::class.java)?.text
//                }
//
//            })
    }
}
class Todo{
    var text:String=""
    var time:String=""
}