package com.example.nac01_mobile

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela_sobre.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sh = getSharedPreferences("valores", Context.MODE_PRIVATE)

        imgMercadoLivre.setOnClickListener { view: View? ->

            sh.edit().putString("vl", txtMercado.text.toString()).apply()
        }

        imgMercadoLivre.setOnClickListener { view: View? ->

            var texto = sh.getString("vl", "Caixas Limpas")
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()

        }

        imgMercadoLivre.setOnClickListener { view: View? ->

            try {

                var intent = Intent(this, WebMercado::class.java)
                startActivity(intent)
            }catch (e: Exception){

            }
        }

        imgNetshoes.setOnClickListener { view: View? ->

            try {
                var intent = Intent(this, WebNetshoes::class.java)
                startActivity(intent)
            }catch (e: Exception){

            }
        }

        imgBuscape.setOnClickListener { view: View? ->

            try {

                var intent = Intent(this, WebBuscape::class.java)
                startActivity(intent)
            }catch (e: Exception){

            }
        }

        imgAmericanas.setOnClickListener { view: View? ->

            try {

                var intent = Intent(this, WebAmericanas::class.java)
                startActivity(intent)
            }catch (e: Exception){

            }
        }

        imgMagalu.setOnClickListener { view: View? ->

            try {

                var intent = Intent(this, WebMagalu::class.java)
                startActivity(intent)
            }catch (e: Exception){

            }
        }

        imgEbay.setOnClickListener { view: View? ->

            try {

                var intent = Intent(this, WebEbay::class.java)
                startActivity(intent)
            }catch (e: Exception){

            }
        }

        btSobre.setOnClickListener { view: View? ->

            try {

                var intent = Intent(this, TelaSobre::class.java)
                startActivity(intent)
            } catch (e: Exception) {

            }
        }
    }
}
