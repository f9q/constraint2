package com.example.sjjg.constraint2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sjjg.constraint2.databinding.FragmentRatioBinding

class RatioFrgmt : Fragment() {
    lateinit var binding : FragmentRatioBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentRatioBinding.inflate(inflater,container,false)
        return binding.root
    }


}