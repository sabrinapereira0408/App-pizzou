package br.com.sg2l2.pizzou

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.navigation_menu.*
import kotlinx.android.synthetic.main.toolbar.*

class MenuActivity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        this.generic_layout = layoutMenuLateral

         /* botaozinho2.setOnClickListener {
            val intent: Intent = Intent(this, CardapioActivity::class.java)
            startActivity(intent)
        }

        botaozinho3.setOnClickListener {
            val intent: Intent = Intent(this, TaxaEntregaActivity::class.java)
            startActivity(intent) }

        botaozinho4.setOnClickListener {
            val intent: Intent = Intent(this, PromocaoActivity::class.java)
            startActivity(intent) } */

        setSupportActionBar(toolbar_view)


        supportActionBar?.title = "Promoções"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        configuraMenuLateral()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        val id = item?.itemId
        if  (id == R.id.action_buscar) {
            Toast.makeText(context, "Botão de buscar", Toast.LENGTH_LONG).show()
        } else if (id == R.id.action_atualizar) {
            Toast.makeText(context, "Botão de atualizar", Toast.LENGTH_LONG).show()
        }
        else if (id == R.id.action_config) {
            Toast.makeText(context, "Botão de Config", Toast.LENGTH_LONG).show()
        }
        else if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}