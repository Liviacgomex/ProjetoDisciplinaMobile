package com.example.casa.mobile

import java.io.Serializable
import java.util.*


data class Tarefa(var tarefa: String,
                  var status: Boolean,
                  var prazo: String,
                  var detalhes: String) : Serializable