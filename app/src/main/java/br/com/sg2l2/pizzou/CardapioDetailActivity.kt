package br.com.sg2l2.pizzou

import android.os.Bundle
import android.widget.Toast

class CardapioDetailActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio_detail)
        val produto = intent.getSerializableExtra("produto")
        Toast.makeText(this, "$produto", Toast.LENGTH_LONG).show()
    }
}