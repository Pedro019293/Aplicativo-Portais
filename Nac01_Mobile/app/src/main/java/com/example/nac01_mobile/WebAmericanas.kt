package com.example.nac01_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_americanas.*

class WebAmericanas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_americanas)

        idAmericanas.loadUrl("https://www.americanas.com.br/?epar=af_00_00_ra_acom&afpid=3609492&siteID=Nn_xyQrt0qU-aBc1E76TX6Cpn1qKYv4NwA")

    }
}
