package dev.lotus.picturebook

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBookActivity1 : AppCompatActivity() {
    lateinit var btnNxt: Button
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book1)
        val actionBar = supportActionBar
        actionBar!!.title = "Lotus Flower"

        actionBar.setDefaultDisplayHomeAsUpEnabled(true)

        btnNxt = findViewById(R.id.btnNxt)
        btnNxt.setOnClickListener {
            val intent = Intent(this, PictureBkRoseActivity2:: class.java )
            startActivity(intent)
        }
    }
}