package uz.umarov.playmarketui.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import uz.umarov.playmarketui.Model.Program
import uz.umarov.playmarketui.databinding.InnerItemBinding

class InnerAdapter(private val itemList: ArrayList<Program>) :
    RecyclerView.Adapter<InnerAdapter.MyVh>() {

    inner class MyVh(private val binding: InnerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(title: Program) {

            binding.textView.text = title.title

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVh {
        return MyVh(
            InnerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: InnerAdapter.MyVh, position: Int) {
        holder.onBind(itemList[position])
    }
}