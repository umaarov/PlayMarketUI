package uz.umarov.playmarketui.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.umarov.playmarketui.Model.ProgramType
import uz.umarov.playmarketui.databinding.RvItemBinding

class RvAdapter(private val itemList: ArrayList<ProgramType>) :
    RecyclerView.Adapter<RvAdapter.MyViewHolder>() {
    inner class MyViewHolder(private val binding: RvItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(text: ProgramType, position: Int) {

            binding.tv.text = text.text
            binding.recyclerView.adapter = InnerAdapter(itemList[position].list)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            RvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(itemList[position], position)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}