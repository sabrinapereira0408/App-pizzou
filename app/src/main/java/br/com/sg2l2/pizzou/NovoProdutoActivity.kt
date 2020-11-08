package br.com.sg2l2.pizzou

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_novo_produto.*

class NovoProdutoActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_produto)

        botaoSalvar.setOnClickListener {
            val d = Cardapio()
            d.nome = nomeProduto.text.toString()
            d.foto = foto.text.toString()
            d.preco =  "R$" + preco.text.toString()

            Thread {
                CardapioService.saveProduto(d)
                runOnUiThread {
                    finish()
                }
            }.start()
        }
    }
}