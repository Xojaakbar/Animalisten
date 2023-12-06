package uz.gita.luis.animalsounds.adapter

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.gita.luis.animalsounds.data.ItemData
import uz.gita.luis.animalsounds.databinding.ItemAnimalBinding

class AnimalAdapter: ListAdapter<ItemData,AnimalAdapter.ViewHolder>(diffutils) {
    private var soundListener: ((Int)->Unit)? = null
    fun setSoundListener(block:(Int)->Unit){
        soundListener = block
    }

    object diffutils : DiffUtil.ItemCallback<ItemData>(){
        override fun areItemsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
            return oldItem == newItem
        }
    }

    inner class ViewHolder(private val binding: ItemAnimalBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(){
            binding.apply {
                animalPhoto.setImageResource(currentList[adapterPosition].picture)
                nameOfAnimal.text = currentList[adapterPosition].name
                binding.root.setOnClickListener {
                    binding.root.isClickable = false
                    binding.animalPhoto.animate().setDuration(100).scaleYBy(1.1F).scaleXBy(1.1F)
                        .withEndAction {
                            binding.root.isClickable = true
                            binding.animalPhoto.animate().setDuration(100).scaleYBy(-1.1F).scaleXBy(-1.1F).start() }.start()
                    soundListener?.invoke(currentList[adapterPosition].sound)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemAnimalBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}