package com.example.casa.mobile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_mobile.*


class Main : AppCompatActivity() {

    private val series : MutableList<Serie> by lazy{ mutableListOf<Serie>()}
    private var adapter : ArrayAdapter<Serie>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile)

        botaoAdd.setOnClickListener{
            val intent = Intent(this, Detalhes::class.java)
            startActivityForResult(intent, REQUEST_INSERT)
        }

        listaSeries.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, series[position].serie, Toast.LENGTH_SHORT).show()

        }

        val adapter = ArrayAdapter<Serie>(this, android.R.layout.simple_list_item_1, series)
        listaSeries.adapter = adapter

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQUEST_INSERT && resultCode == RESULT_OK){
            val serie = data?.getSerializableExtra(Detalhes.EXTRA_PERSON) as? Serie
            if(serie != null){
                series.add(serie)
                series.sortedBy { it.serie }
                adapter?.notifyDataSetChanged()
            }
        }
    }

    companion object {
        val REQUEST_INSERT = 0
    }

}
