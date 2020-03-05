package com.example.nac01_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_buscape.*

class WebBuscape : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_buscape)

        idBuscape.loadUrl("https://www.buscape.com.br/?og=19220&gclid=EAIaIQobChMIzMv969SA6AIVA5yzCh0HlwswEAAYASAAEgLkn_D_BwE")
    }
}
