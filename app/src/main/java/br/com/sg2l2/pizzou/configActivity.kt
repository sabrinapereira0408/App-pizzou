package br.com.sg2l2.pizzou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class configActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configs)

        supportActionBar?.title = "Configurações"

    }
}