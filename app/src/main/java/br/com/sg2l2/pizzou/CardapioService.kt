package br.com.sg2l2.pizzou

object CardapioService {

    fun getCardapio(): List<Cardapio> {
        val produtos = mutableListOf<Cardapio>()

        for (i in 1..10) {
            val d = Cardapio()
            d.nome = "Pizza $i"
            d.valor = "Valor: $i R$"
            d.foto = "https://pngriver.com/wp-content/uploads/2018/04/Download-Pizza-PNG-Picture-1.png"
            produtos.add(d)
        }

        return produtos
    }
}