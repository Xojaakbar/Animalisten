package uz.gita.luis.animalsounds.fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import popBackStack
import uz.gita.luis.animalsounds.R
import uz.gita.luis.animalsounds.adapter.AnimalAdapter
import uz.gita.luis.animalsounds.data.ItemData

class SoundsFragment:Fragment(R.layout.fragment_sounds) {
     private val adapter = AnimalAdapter()
     private var sound : MediaPlayer? = null
     private var type:String = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        type = requireArguments().getString("type","null")

        val title = view.findViewById<TextView>(R.id.text_animal_type)
        val recyclerview = view.findViewById<RecyclerView>(R.id.recycler_view)

        view.findViewById<ImageView>(R.id.btn_back).setOnClickListener {
            popBackStack() }
        when(type){
            "wild" -> { adapter.submitList(wildList())
                      title.text = "Wild animals"  }
            "birds" -> { adapter.submitList(birds())
                title.text = "Birds" }
            "domestic" -> { adapter.submitList(domesticList())
                title.text = "Domestic animals" }
            else -> {}
        }

        recyclerview.adapter = adapter

        adapter.setSoundListener { soundRes ->
            sound = MediaPlayer.create(requireContext(),soundRes)
            sound?.start()
        }
    }

    fun wildList() : List<ItemData>{
        val list = arrayListOf<ItemData>()
        list.add(ItemData(R.raw.wild_sloth,R.drawable.wild_sloth,"Sloth"))
        list.add(ItemData(R.raw.wild_sloth2,R.drawable.wild_sloth2,"Sloth"))
        list.add(ItemData(R.raw.wild_sloth3,R.drawable.wild_sloth3,"Sloth"))
        list.add(ItemData(R.raw.wild_sloth4,R.drawable.wild_sloth4,"Sloth"))
        list.add(ItemData(R.raw.wild_wolf,R.drawable.wild_wolf,"Wolf"))
        list.add(ItemData(R.raw.wild_snake_hissing,R.drawable.wild_snake_hissing,"Snake"))
        list.add(ItemData(R.raw.wild_snake,R.drawable.wild_snake,"Snake"))
        list.add(ItemData(R.raw.wild_elephant,R.drawable.wild_elephant,"Elephant"))
        list.add(ItemData(R.raw.wild_monkey,R.drawable.wild_monkey,"Monkey"))
        list.add(ItemData(R.raw.wild_tiger,R.drawable.wild_tiger,"Tiger"))
        list.add(ItemData(R.raw.wild_angry_tiger,R.drawable.wild_angry_tiger,"Angry Tiger"))
        list.add(ItemData(R.raw.wild_yak,R.drawable.wild_yak,"Yak"))
        list.add(ItemData(R.raw.wild_chipmunk,R.drawable.wild_chipmunk,"Chipmunk"))
        list.add(ItemData(R.raw.wild_fox,R.drawable.wild_fox,"Fox"))
        list.add(ItemData(R.raw.wild_rhino,R.drawable.wild_rhino,"Rhino"))
        list.add(ItemData(R.raw.wild_leopard,R.drawable.wild_leopard,"Leopard"))
        list.add(ItemData(R.raw.wild_zebra,R.drawable.wild_zebra,"Zebra"))
        list.add(ItemData(R.raw.wild_giraffie,R.drawable.wild_giraffe,"Giraffe"))
        list.add(ItemData(R.raw.wild_panda,R.drawable.wild_panda,"Panda"))
        list.add(ItemData(R.raw.wild_penguin,R.drawable.wild_penguin,"Penguin"))
        list.add(ItemData(R.raw.wild_bear,R.drawable.wild_bear,"Bear"))
        list.add(ItemData(R.raw.wild_puma,R.drawable.wild_puma,"Puma"))
        list.add(ItemData(R.raw.wild_kangaroo,R.drawable.wild_kangaroo,"Kangaroo"))
        list.add(ItemData(R.raw.wild_elephant,R.drawable.wild_elephant,"Elephant"))

        return list
    }

    fun domesticList() : List<ItemData>{
        val list = arrayListOf<ItemData>()
        list.add(ItemData(R.raw.domestic_duck,R.drawable.domestic_duck,"Duck"))
        list.add(ItemData(R.raw.domestic_horse,R.drawable.domestic_horse,"Horse"))
        list.add(ItemData(R.raw.domestic_pony,R.drawable.domestic_pony,"Pony"))
        list.add(ItemData(R.raw.domestic_pig,R.drawable.domestic_pig,"Pig"))
        list.add(ItemData(R.raw.domestic_goat,R.drawable.domestic_goat,"Goat"))
        list.add(ItemData(R.raw.domestic_sheep,R.drawable.domestic_sheep,"Sheep"))
        list.add(ItemData(R.raw.domestic_horse_taqa,R.drawable.domestic_horse_taqa,"Horseshoe"))
        list.add(ItemData(R.raw.domestic_chicken,R.drawable.domestic_hen,"Hen"))
        list.add(ItemData(R.raw.domestic_rooster,R.drawable.domestic_chicken,"Rooster"))
        list.add(ItemData(R.raw.domestic_donkey,R.drawable.domestic_donkey,"Donkey"))
        list.add(ItemData(R.raw.domestic_rabbit,R.drawable.domestic_rabbit,"Rabbit"))
        list.add(ItemData(R.raw.domestic_cat,R.drawable.domestic_cat,"Cat"))
        list.add(ItemData(R.raw.domestic_dog,R.drawable.domestic_dog,"Dog"))
        list.add(ItemData(R.raw.domestic_cow,R.drawable.domestic_cow,"Cow"))
        list.add(ItemData(R.raw.domestic_breathing_dog,R.drawable.domestic_breathing_dog,"Breathing dog"))
        return list
         }

        fun birds() : List<ItemData>{
            val list = arrayListOf<ItemData>()
            list.add(ItemData(R.raw.bird_nickype_sound,R.drawable.bird_nickybird," Nickype"))
            list.add(ItemData(R.raw.bird_eagle,R.drawable.bird_eagle,"Eagle"))
            list.add(ItemData(R.raw.bird_owl,R.drawable.bird_owl,"Owl"))
            list.add(ItemData(R.raw.bird_seagulls,R.drawable.bird_seagulls,"Seagulls"))
            list.add(ItemData(R.raw.bird_wren,R.drawable.bird_wren,"Wren"))
            list.add(ItemData(R.raw.bird_quail,R.drawable.bird_quail,"Quail"))
            list.add(ItemData(R.raw.bird_parrot,R.drawable.bird_parrot,"Parrot"))
            list.add(ItemData(R.raw.bird_pigeon,R.drawable.bird_pigeon,"Pigeon"))
            list.add(ItemData(R.raw.bird_vulture,R.drawable.bird_vulture,"Vulture"))
            list.add(ItemData(R.raw.bird_pombo,R.drawable.bird_pombo,"Pombo"))
            list.add(ItemData(R.raw.bird_lapwing,R.drawable.bird_lapwing,"Lapwing"))
            list.add(ItemData(R.raw.bird_finch,R.drawable.bird_finch,"Finch"))
            list.add(ItemData(R.raw.bird_canary,R.drawable.bird_canary,"Canary"))
            list.add(ItemData(R.raw.bird_raven,R.drawable.bird_raven,"Raven"))
            list.add(ItemData(R.raw.bird_cardinal,R.drawable.bird_cardinal,"Cardinal"))
          return list
        }

    override fun onDestroy() {
        super.onDestroy()
        sound?.stop()
    }
}