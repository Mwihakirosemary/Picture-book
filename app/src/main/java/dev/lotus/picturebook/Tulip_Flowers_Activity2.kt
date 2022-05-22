package dev.lotus.picturebook

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Tulip_Flowers_Activity2 : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lily_flower2)
        val actionBar = supportActionBar
        actionBar!!.title = "Tulip Flowers"

        actionBar.setDefaultDisplayHomeAsUpEnabled(true)
    }
}