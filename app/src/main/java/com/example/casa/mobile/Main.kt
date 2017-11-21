package com.example.casa.mobile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mobile.*

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile)

        botaoAdd.setOnClickListener{
            val intent = Intent(this, Detalhes::class.java)
            startActivity(intent)
        }

    }
}
