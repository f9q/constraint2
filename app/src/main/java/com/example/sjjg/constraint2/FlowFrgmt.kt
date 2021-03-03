package com.example.sjjg.constraint2

import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.constraintlayout.helper.widget.Flow
import com.example.sjjg.constraint2.databinding.FragmentFlowBinding
import com.google.android.material.snackbar.Snackbar


class FlowFrgmt : Fragment() {
    lateinit var binding: FragmentFlowBinding

    private fun onFlow1Animator(v : View){
        (AnimatorInflater.loadAnimator(requireContext(),R.animator.rotation) as ObjectAnimator).run {
            target = binding.flow1
            start()
        }
    }
    val flow1VisibleChanged = object : CompoundButton.OnCheckedChangeListener{
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            if (isChecked){
                binding.flow1.visibility = View.VISIBLE
            }else{
                binding.flow1.visibility = View.INVISIBLE
            }
        }

    }
    private fun onFlow1Clicked(v : View){
        Snackbar.make(v,"onFlow1Clicked",Snackbar.LENGTH_SHORT).show()
    }
    private fun onWrapNoneClicked(v : View){
        binding.flow1.setWrapMode(Flow.WRAP_NONE)
        binding.flow2.setWrapMode(Flow.WRAP_NONE)
    }
    private fun onWrapChainClicked(v : View){
        binding.flow1.setWrapMode(Flow.WRAP_CHAIN)
        binding.flow2.setWrapMode(Flow.WRAP_CHAIN)
    }
    private fun onWrapAlignClicked(v : View){
        binding.flow1.setWrapMode(Flow.WRAP_ALIGNED)
        binding.flow2.setWrapMode(Flow.WRAP_ALIGNED)
    }
    private fun initBinding(){
        binding.wrapNone.setOnClickListener(this::onWrapNoneClicked)
        binding.wrapChain.setOnClickListener(this::onWrapChainClicked)
        binding.wrapAlign.setOnClickListener(this::onWrapAlignClicked)
        binding.flow1.setOnClickListener(this::onFlow1Clicked)
        binding.flow1Visible.setOnCheckedChangeListener(flow1VisibleChanged)
        binding.flow1Anim.setOnClickListener(this::onFlow1Animator)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFlowBinding.inflate(inflater,container,false)
        initBinding()
        return binding.root
    }

}