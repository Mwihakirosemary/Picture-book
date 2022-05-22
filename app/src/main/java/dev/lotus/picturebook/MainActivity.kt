package dev.lotus.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPbk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPbk = findViewById(R.id.btnPbk)
        btnPbk.setOnClickListener {
            val intent = Intent(this, PictureBookActivity1:: class.java )
            startActivity(intent)
        }
    }
}