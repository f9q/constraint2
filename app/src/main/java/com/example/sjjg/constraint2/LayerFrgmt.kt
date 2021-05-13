package com.example.sjjg.constraint2

import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.fragment.app.Fragment
import com.example.sjjg.constraint2.databinding.FragmentLayerBinding
import com.google.android.material.snackbar.Snackbar

class LayerFrgmt : Fragment() {

    lateinit var binding: FragmentLayerBinding

    val layer1Tint  = object : CompoundButton.OnCheckedChangeListener{
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            val color1 = if (isChecked){
                resources.getColor(R.color.layer1Color)
            }else{
                resources.getColor(R.color.translucent)
            }
            binding.layer1.setBackgroundColor(color1)
        }
    }
    val layer1Hidden  = object : CompoundButton.OnCheckedChangeListener{
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            if (isChecked){
                binding.layer1.visibility = View.VISIBLE
            }else{
                binding.layer1.visibility = View.GONE
            }
        }
    }
    private fun onLayer1AnimClicked(v: View){
        (AnimatorInflater.loadAnimator(requireContext(), R.animator.alpha) as ObjectAnimator).apply {
            setTarget(binding.layer1)
            start()
        }
    }

    val layer2Tint  = object : CompoundButton.OnCheckedChangeListener{
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            val color2 = if (isChecked){
                resources.getColor(R.color.layer2Color)
            }else{
                resources.getColor(R.color.translucent)
            }
            binding.layer2.setBackgroundColor(color2)
        }
    }
    val layer2Hidden  = object : CompoundButton.OnCheckedChangeListener{
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            if (isChecked){
                binding.layer2.visibility = View.VISIBLE
            }else{
                binding.layer2.visibility = View.GONE
            }
        }
    }
    private fun onLayer2AnimClicked(v: View){
        (AnimatorInflater.loadAnimator(requireContext(), R.animator.rotation) as ObjectAnimator).apply {
            setTarget(binding.layer2)
            start()
        }
    }
    private fun initBinding(){
        binding.layer1Tint.setOnCheckedChangeListener(layer1Tint)
        binding.layer1Hidden.setOnCheckedChangeListener(layer1Hidden)
        binding.layer2Tint.setOnCheckedChangeListener(layer2Tint)
        binding.layer2Hidden.setOnCheckedChangeListener(layer2Hidden)
        binding.layer1Anim.setOnClickListener(this::onLayer1AnimClicked)
        binding.layer2Anim.setOnClickListener(this::onLayer2AnimClicked)
        binding.layer1.setOnClickListener{it->
            Snackbar.make(binding.root,"layer1 clicked",Snackbar.LENGTH_SHORT).show()
        }
        binding.layer2.setOnClickListener{it->
            Snackbar.make(binding.root,"layer2 clicked",Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentLayerBinding.inflate(inflater,container,false)
        initBinding()
        return binding.root
    }
}