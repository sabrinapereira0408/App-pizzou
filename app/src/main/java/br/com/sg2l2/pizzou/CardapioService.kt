package br.com.sg2l2.pizzou

import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object CardapioService {

    val host = "http://zguilz.pythonanywhere.com"
    val TAG = "WS_LMSApp"

    fun getCardapio(): List<Cardapio> {

        //val url = "$host/cardapio"
        // val json = HttpHelper.get(url)

        //Log.d(TAG , json)


       //return parseJson<List<Cardapio>>(json)

        return DatabaseManager.getCardapioDAO().findAll()
    }
    fun saveProduto(cardapio: Cardapio) {
        //val json = GsonBuilder().create().toJson(disciplina)

        //HttpHelper.post("$host/disciplinas", json)
        DatabaseManager.getCardapioDAO().insert(cardapio)
    }

    inline fun <reified T> parseJson(json: String) : T {
        val type = object: TypeToken<T>(){}.type
        return Gson().fromJson<T>(json, type)
    }
}