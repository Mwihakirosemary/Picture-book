package dev.lotus.picturebook

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cherry_Blossom_Activity2 : AppCompatActivity() {
    lateinit var btnLnr: Button
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cherry_blossom2)
        val actionBar = supportActionBar
        actionBar!!.title = "Cherry Blossom Flowers"

        actionBar.setDefaultDisplayHomeAsUpEnabled(true)
        btnLnr = findViewById(R.id.btnLnr)
        btnLnr.setOnClickListener {
            val intent = Intent(this, Native_Flower_Activity2:: class.java )
            startActivity(intent)
        }
    }
}