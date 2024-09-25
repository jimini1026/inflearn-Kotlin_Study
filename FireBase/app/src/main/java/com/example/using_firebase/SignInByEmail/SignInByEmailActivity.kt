package com.example.using_firebase.SignInByEmail

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.using_firebase.R
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class SignInByEmailActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_by_email)

        auth = Firebase.auth

        findViewById<Button>(R.id.joinBtn).setOnClickListener {

            val email = findViewById<EditText>(R.id.emailArea).text.toString()
            val password = findViewById<EditText>(R.id.passwordArea).text.toString()

            Log.d("MAIN", email)
            Log.d("MAIN", password)

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Toast.makeText(baseContext, "Authentication success.", Toast.LENGTH_SHORT,).show()
                        val user = auth.currentUser
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT,).show()
                    }
                }
        }

        findViewById<Button>(R.id.loginBtn).setOnClickListener {

            val email = findViewById<EditText>(R.id.emailArea).text.toString()
            val password = findViewById<EditText>(R.id.passwordArea).text.toString()

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Toast.makeText(baseContext, "Authentication success.", Toast.LENGTH_SHORT,).show()
                        val user = auth.currentUser
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT,).show()
                    }
                }
        }

        findViewById<Button>(R.id.logoutBtn).setOnClickListener {
            Firebase.auth.signOut()
            Toast.makeText(baseContext, "LogOut", Toast.LENGTH_SHORT,).show()
        }
    }
}