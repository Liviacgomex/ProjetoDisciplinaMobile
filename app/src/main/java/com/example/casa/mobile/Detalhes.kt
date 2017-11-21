package com.example.casa.mobile

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalhes.*

class Detalhes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)


        botaoAdd.setOnClickListener {
            val tarefa = campoTarefa.text.toString();
            val status = campoStatus.text.toString().toBoolean();
            val prazo = campoData.text.toString();
            val detalhes = campoDetalhes.text.toString();
            val Tarefa = Tarefa(tarefa, status, prazo, detalhes);

            val intent = Intent()
            intent.putExtra("tarefa", Tarefa);
            setResult(Activity.RESULT_OK, intent)
            finish()

        }

    }
}
