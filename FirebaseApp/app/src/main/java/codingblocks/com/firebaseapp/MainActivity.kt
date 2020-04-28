package codingblocks.com.firebaseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.view.isVisible
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.FirebaseException
import com.google.firebase.auth.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    val auth by lazy {
        FirebaseAuth.getInstance()
    }

    var verificationId: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        auth.addAuthStateListener {
//            if (it.currentUser != null) {
//                btn.isVisible = false
//                btn2.isVisible = true
//            } else {
//                btn.isVisible = true
//                btn2.isVisible = false
//            }
//        }

//Log.i("toastlengthlong",Toast.LENGTH_LONG.toString())
//        Log.i("toastlengthshort",Toast.LENGTH_SHORT.toString())

//        fun updateUI(user: FirebaseUser?) {
//            if (user != null) {
//                //Do your Stuff
//                Toast.makeText(this, "Hello ${user.displayName}", Toast.LENGTH_LONG).show()
//            }
//            fun onStart() {
//                super.onStart()
//                // Check if user is signed in (non-null) and update UI accordingly.
//                val currentUser = auth.currentUser
//                updateUI(currentUser)
//            }
//
//        }
        btn2.setOnClickListener {
            //            auth.signOut()
//            val signInIntent = mGoogleSignInClient.getSignInIntent()
//            startActivityForResult(signInIntent, 7)
//        }
//        public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
//            super.onActivityResult(requestCode, resultCode, data)
//
//            // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
//            if (requestCode == 7) {
//                val task = GoogleSignIn.getSignedInAccountFromIntent(data)
//                try {
//                    // Google Sign In was successful, authenticate with Firebase
//                    val account = task.getResult(ApiException::class.java)
//                    firebaseAuthWithGoogle(account)
//                } catch (e: ApiException) {
//                    // Google Sign In failed, update UI appropriately
//                    Log.w("Login", "Google sign in failed", e)
//                    // ...
//                }
//
//            }
//        }

//        fun firebaseAuthWithGoogle(acct: GoogleSignInAccount) {
//            Log.d("Login", "firebaseAuthWithGoogle:" + acct.id!!)
//
//            val credential = GoogleAuthProvider.getCredential(acct.idToken, null)
//            auth.signInWithCredential(credential)
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {
//                        // Sign in success, update UI with the signed-in user's information
//                        Log.d("Login", "signInWithCredential:success")
//                        val user = auth.currentUser
//                        updateUI(user)
//                    } else {
//                        // If sign in fails, display a message to the user.
//                        Log.w("Login", "signInWithCredential:failure", task.exception)
//                        Toast.makeText(this, "Auth Failed", Toast.LENGTH_LONG).show()
//                        updateUI(null)
//                    }
//
//                    // ...
//                }
//
//        }

//            auth.signOut()
            tvotp.setText(verificationId)
            val phoneAuthCredential =
                PhoneAuthProvider.getCredential(verificationId, password.editText?.text.toString())
            createAccount(phoneAuthCredential)
        }

//    val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//        .requestIdToken(getString(R.string.default_web_client_id))
//        .requestEmail()
//        .build()
//    var mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
        val callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            override fun onVerificationCompleted(p0: PhoneAuthCredential?) {
                Toast.makeText(this@MainActivity, "Verification Completed", Toast.LENGTH_LONG)
                    .show()
                createAccount(p0)
            }

            override fun onVerificationFailed(p0: FirebaseException?) {
                Toast.makeText(this@MainActivity, "Verification Failed", Toast.LENGTH_LONG).show()

            }

            override fun onCodeSent(p0: String?, p1: PhoneAuthProvider.ForceResendingToken?) {
                super.onCodeSent(p0, p1)
                Toast.makeText(this@MainActivity, "Code Sent", Toast.LENGTH_LONG).show()
                verificationId = p0!!
                tvotp.setText(p0+p1)

            }
        }

        btn.setOnClickListener {
//                        if (email.editText?.text.isNullOrEmpty()) {
//                email.isErrorEnabled = true
//                email.error = "Cannot be Empty"
//            } else if (password.editText?.text.isNullOrEmpty()) {
//                password.isErrorEnabled = true
//                password.error = "Cannot be Empty"
//            } else {
//                auth.createUserWithEmailAndPassword(
//                    email.editText?.text.toString(),
//                    password.editText?.text.toString()
//                ).addOnCompleteListener {
//                    btn.isEnabled = false
//                }.addOnSuccessListener {
//                    btn.isEnabled = true
//                    Toast.makeText(this, "Account Created Succesfully", Toast.LENGTH_LONG).show()
//
//                }.addOnFailureListener {
//                    btn.isEnabled = true
//                    Toast.makeText(this, it.localizedMessage, Toast.LENGTH_LONG).show()
//                    if (it.localizedMessage.contains("use", true)) {
//                        loginUser()
//                    }
//                }
//            }

            PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+91${email.editText?.text}", // Phone number to verify
                60, // Timeout duration
                TimeUnit.SECONDS, // Unit of timeout
                this, // Activity (for callback binding)
                callbacks
            ) // OnVerificationStateChangedCallbacks
        }

    }

    private fun createAccount(p0: PhoneAuthCredential?) {
        auth.signInWithCredential(p0!!).addOnCompleteListener {

        }.addOnSuccessListener {
            Toast.makeText(this@MainActivity, "verfication successful!", Toast.LENGTH_LONG).show()

        }.addOnFailureListener {
            Toast.makeText(this@MainActivity, "verification failed!${it.localizedMessage}", Toast.LENGTH_LONG).show()

        }

    }

    private fun loginUser() {
        auth.signInWithEmailAndPassword(
            email.editText?.text.toString(),
            password.editText?.text.toString()
        ).addOnCompleteListener {
            btn.isEnabled = false
        }.addOnSuccessListener {
            btn.isEnabled = true
            Toast.makeText(this, "Logged In Succesfully", Toast.LENGTH_LONG).show()
        }.addOnFailureListener {
            btn.isEnabled = true
            Toast.makeText(this, it.localizedMessage, Toast.LENGTH_LONG).show()
        }
    }
}




