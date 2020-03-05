package com.example.nac01_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_netshoes.*

class WebNetshoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_netshoes)

        idNetshoes.loadUrl("https://www.netshoes.com.br/?campaign=gglepqbdg&gclid=EAIaIQobChMI8dbKiNSA6AIVhK7ICh3zIQAlEAAYASAAEgJ3xfD_BwE&gclsrc=aw.ds")
    }
}
