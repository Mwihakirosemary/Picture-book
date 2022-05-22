package dev.lotus.picturebook

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Native_Flower_Activity2 : AppCompatActivity() {
    lateinit var btnLly: Button
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_native_flower2)
        val actionBar = supportActionBar
        actionBar!!.title = "Lavendar Plant"

        actionBar.setDefaultDisplayHomeAsUpEnabled(true)

        btnLly = findViewById(R.id.btnLly)
        btnLly.setOnClickListener {
            val intent = Intent(this, Tulip_Flowers_Activity2:: class.java )
            startActivity(intent)
        }
    }
}