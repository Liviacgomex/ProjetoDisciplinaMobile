package com.example.casa.mobile

import android.app.Activity
import android.widget.ArrayAdapter
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalhes.*

class Detalhes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)


        botaoAdd.setOnClickListener {
            val nome = campoSerie.text.toString();
            val episodio = campoEpisodio.text.toString();
            val temporada = campoTemporada.text.toString();

            var Serie = Serie(nome, episodio, temporada)

            val intent = Intent()
            intent.putExtra(EXTRA_PERSON, Serie);
            setResult(Activity.RESULT_OK, intent)
            finish()

        }
    }

    companion object{
        val EXTRA_PERSON = "series"
    }


}
