package br.edu.fatecpg.filmes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.filmes.R
import br.edu.fatecpg.filmes.model.Diretor

class DiretorAdapter(private val diretores:List<Diretor>):
        RecyclerView.Adapter<DiretorAdapter.ViewHolder>(){
        class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
                val txvdiretor: TextView = itemView.findViewById(R.id.txv_diretor)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_diretor, parent, false)
                return ViewHolder(view)
                }


        override fun onBindViewHolder(
                holder: ViewHolder,
                position: Int,
        ) {
                val diretor = diretores[position]
                holder.txvdiretor.text = diretor.diretor
                }


        override fun getItemCount(): Int {
                return diretores.size
                }
        }