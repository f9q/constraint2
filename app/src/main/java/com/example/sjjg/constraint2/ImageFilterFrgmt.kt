package com.example.sjjg.constraint2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sjjg.constraint2.databinding.FragmentImageFilterBinding

class ImageFilterFrgmt : Fragment() {
    
    lateinit var binding : FragmentImageFilterBinding



    private fun initBinding(){

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentImageFilterBinding.inflate(inflater,container,false)
        initBinding()
        return binding.root
    }

}