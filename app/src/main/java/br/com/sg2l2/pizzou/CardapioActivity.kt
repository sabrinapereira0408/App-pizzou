package br.com.sg2l2.pizzou

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_cardapio.*
import kotlinx.android.synthetic.main.toolbar.*

class CardapioActivity: DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio)

        this.generic_layout = layoutMenuLateral

        setSupportActionBar(toolbar_view)


        supportActionBar?.title = "Cardápio"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        configuraMenuLateral()

        recyclerCardapio?.layoutManager = LinearLayoutManager(this)
        recyclerCardapio?.itemAnimator = DefaultItemAnimator()
        recyclerCardapio?.setHasFixedSize(true)
    }

    override fun onResume() {
        super.onResume()
        taskCardapio()
    }

    var cardapio = listOf<Cardapio>()

    fun taskCardapio() {
        Thread {
            this.cardapio = CardapioService.getCardapio()
            runOnUiThread() {
                recyclerCardapio?.adapter =
                    CardapioAdapter(this.cardapio) {
                        onClickCardapio(it)
                    }
            }

        }.start()

    }

    fun onClickCardapio(cardapio: Cardapio) {
        val it = Intent(this, CardapioDetailActivity::class.java)
        it.putExtra("produto", cardapio)
        startActivity(it)
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
        else if (id == R.id.action_nova) {
            val it = Intent(this, NovoProdutoActivity::class.java)
            startActivity(it)
        }
        else if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }





}