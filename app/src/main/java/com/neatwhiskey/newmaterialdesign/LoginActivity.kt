package com.neatwhiskey.newmaterialdesign

//import android.widget.*
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_login.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnLogin.setOnClickListener {
            if (edEmail.text.toString().equals("Neatwhiskey@gmail.com")
                && edPassword.text.toString().equals("password")) {
                val intent = Intent(this, ListView::class.java)
                startActivity(intent)
            }
            else Toast.makeText(applicationContext, "Wrong email or password",Toast.LENGTH_SHORT).show()


        }


    }
}
