package br.com.sg2l2.pizzou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class TaxaEntregaActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taxaentrega)

        supportActionBar?.title = "Taxa de Entrega"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        val id = item?.itemId
        if (id == R.id.action_config) {
            Toast.makeText(this,"Configurações", Toast.LENGTH_LONG).show()
            val intent: Intent = Intent(this, ConfigActivity::class.java)
            startActivity(intent)
        }
        else if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }





}