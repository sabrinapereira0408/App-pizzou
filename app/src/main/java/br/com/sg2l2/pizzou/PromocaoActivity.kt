package br.com.sg2l2.pizzou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_promocao.*
import kotlinx.android.synthetic.main.toolbar.*

class PromocaoActivity: DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promocao)

        this.generic_layout = layoutMenuLateral

        setSupportActionBar(toolbar_view)


        supportActionBar?.title = "Promoções"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        configuraMenuLateral()
    }
}