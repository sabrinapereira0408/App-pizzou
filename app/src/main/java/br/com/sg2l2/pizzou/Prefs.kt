package br.com.sg2l2.pizzou

import android.content.SharedPreferences

object Prefs {

    val PRE_ID = "Pizzou"

    private fun prefs() : SharedPreferences {
        val context = PizzouApplication.getInstance().applicationContext

        return context.getSharedPreferences(PRE_ID, 0)
    }

    fun setString(flag: String, valor: String) = prefs().edit().putString(flag, valor).apply()

    fun getString(flag: String) = prefs().getString(flag, "")


    fun setBoolean(flag: String, valor: Boolean) = prefs().edit().putBoolean(flag, valor).apply()

    fun getBoolean(flag: String) = prefs().getBoolean(flag, false)
}