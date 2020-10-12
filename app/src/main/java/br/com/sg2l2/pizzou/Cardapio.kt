package br.com.sg2l2.pizzou

import java.io.Serializable

class Cardapio: Serializable {

    var id: Long = 0
    var nome = ""
    var valor = ""
    var foto = ""

    override fun toString(): String {
        return "Pizza (nome=$nome)"
    }
}