package com.example.casa.mobile

import java.io.Serializable
import java.util.*


data class Serie(var serie: String,
                 var episodio:  String,
                 var temporada: String) : Serializable{

    override fun toString(): String {
        return "$serie - Ep: $episodio & Temp: $temporada"
    }

}

