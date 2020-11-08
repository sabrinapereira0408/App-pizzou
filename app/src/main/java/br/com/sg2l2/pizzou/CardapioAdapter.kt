package br.com.sg2l2.pizzou

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CardapioAdapter(
    val cardapios: List<Cardapio>,
    val onClick: (Cardapio) -> Unit
): RecyclerView.Adapter<CardapioAdapter.CardapioViewHolder> () {

    class CardapioViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val cardNome: TextView
        val cardImg: ImageView
        val cardProgress: ProgressBar
        val cardPreco: TextView

        init {
            cardNome = view.findViewById(R.id.cardNome)
            cardImg = view.findViewById(R.id.cardImg)
            cardPreco = view.findViewById(R.id.cardPreco)
            cardProgress = view.findViewById(R.id.cardProgress)
        }
    }

    override fun getItemCount() = this.cardapios.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardapioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_cardapio, parent, false)

        val holder = CardapioViewHolder(view)

        return holder
    }

    override fun onBindViewHolder(holder: CardapioViewHolder, posicao: Int) {
        val produto = this.cardapios[posicao]

        holder.cardNome.text = produto.nome
        holder.cardPreco.text = produto.preco
        holder.cardProgress.visibility = View.VISIBLE
        

        Picasso.with(holder.itemView.context).load(produto.foto).fit().into(holder.cardImg,
        object: com.squareup.picasso.Callback{
            override fun onSuccess() {
                holder.cardProgress.visibility = View.GONE
            }

            override fun onError() {
                holder.cardProgress.visibility = View.GONE
            }
        })
        holder.itemView.setOnClickListener {onClick(produto)}
    }

}