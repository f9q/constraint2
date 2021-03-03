package com.example.sjjg.constraint2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sjjg.constraint2.databinding.FragmentBarrierBinding

class BarrierFrmgt : Fragment() {

    lateinit var binding: FragmentBarrierBinding

    private fun onBarrierGoneClicked(v : View){
        binding.barrierView2.visibility = if(binding.barrierView2.visibility == View.VISIBLE){
            View.GONE
        }else{
            View.VISIBLE
        }
    }

    private fun onBarrierWidthChanged(v : View){
        binding.barrierView2.layoutParams.run {
            width -= 20
            binding.barrierView2.layoutParams = this
        }
    }

    fun initBinding(){
        binding.barrier2WidthChange.setOnClickListener(this::onBarrierWidthChanged)
        binding.barrier2Gone.setOnClickListener(this::onBarrierGoneClicked)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBarrierBinding.inflate(inflater,container,false)
        initBinding()
        return binding.root
    }

}