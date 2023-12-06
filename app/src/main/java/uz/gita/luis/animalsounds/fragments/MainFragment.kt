package uz.gita.luis.animalsounds.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import replaceFragment
import replaceFragmentSaveStack
import uz.gita.luis.animalsounds.R
import uz.gita.luis.animalsounds.databinding.FragmentMainBinding

class MainFragment:Fragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            wildCard.setOnClickListener {
                var fm = SoundsFragment()
                val bundle = Bundle()
                bundle.putString("type","wild")
                fm.arguments = bundle
                replaceFragmentSaveStack(fm)
            }
            domesticCard.setOnClickListener {
                var fm = SoundsFragment()
                val bundle = Bundle()
                bundle.putString("type","domestic")
                fm.arguments = bundle
                replaceFragmentSaveStack(fm)
            }
            birdsCard.setOnClickListener {
                var fm = SoundsFragment()
                val bundle = Bundle()
                bundle.putString("type","birds")
                fm.arguments = bundle
                replaceFragmentSaveStack(fm)
            }
        }
    }
}