package br.com.sg2l2.pizzou

import android.app.Application
import java.lang.IllegalStateException

class PizzouApplication: Application(){

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {
        private var appInstance: PizzouApplication? = null

        fun getInstance(): PizzouApplication {
            if (appInstance == null) {
                throw IllegalStateException("Configure o application no Manifest")
            }
            return appInstance!!
        }
    }
}