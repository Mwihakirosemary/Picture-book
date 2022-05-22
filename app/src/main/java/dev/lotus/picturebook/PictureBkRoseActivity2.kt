package dev.lotus.picturebook

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBkRoseActivity2 : AppCompatActivity() {
    lateinit var btnChy: Button
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_bk_rose2)
        val actionBar = supportActionBar
        actionBar!!.title = "Rose Flower"

        actionBar.setDefaultDisplayHomeAsUpEnabled(true)

        btnChy = findViewById(R.id.btnChy)
        btnChy.setOnClickListener {
            val intent = Intent(this, Cherry_Blossom_Activity2:: class.java )
            startActivity(intent)
        }
    }
}