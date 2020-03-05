package com.example.nac01_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_magalu.*

class WebMagalu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_magalu)



        idMagalu.loadUrl("https://www.magazineluiza.com.br/")
    }
}
