package br.com.sg2l2.pizzou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ProgressBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        botaozinho2.setOnClickListener {
            val intent: Intent = Intent(this, TelaInicialActivity::class.java)
            startActivity(intent)
        }

        botaozinho3.setOnClickListener {
            val intent: Intent = Intent(this, TaxaEntregaActivity::class.java)
            startActivity(intent) }

        botaozinho4.setOnClickListener {
            val intent: Intent = Intent(this, PromocaoActivity::class.java)
            startActivity(intent) }


        supportActionBar?.title = "Pizzou"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.main_menu, menu)
            return true
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        val id = item?.itemId
        if (id == R.id.action_sair) {
            Toast.makeText(this, "Saindo", Toast.LENGTH_LONG).show()
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        else if (id == R.id.action_config) {
            Toast.makeText(this,"Configurações", Toast.LENGTH_LONG).show()
            val intent: Intent = Intent(this, configActivity::class.java)
            startActivity(intent)
        }
        else if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}