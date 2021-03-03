package com.example.sjjg.constraint2

import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.example.sjjg.constraint2.databinding.FragmentGroupBinding

class GroupFrgmt : Fragment() {
    lateinit var binding : FragmentGroupBinding

    private fun onGroup1AnimClicked(v : View){
        (AnimatorInflater.loadAnimator(requireContext(),R.animator.rotation) as ObjectAnimator).run {
//            target = binding.groupView1
            target = binding.group1
            start()
        }
    }

    private fun onGroup1BtnChanged(btn : CompoundButton, isChecked : Boolean){
        binding.group1.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
    }
    private fun onGroup2BtnChanged(btn : CompoundButton, isChecked : Boolean){
        binding.group2.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
    }
    private fun onView1Clciked(v : View){
        Log.e("GroupFrgmt","onView1Clciked")
    }
    private fun initBinding(){
        binding.group1Btn.setOnCheckedChangeListener(this::onGroup1BtnChanged)
        binding.group2Btn.setOnCheckedChangeListener(this::onGroup2BtnChanged)
        binding.groupView1.setOnClickListener(this::onView1Clciked)
        binding.group1Anim.setOnClickListener(this::onGroup1AnimClicked)
        binding.group1.setOnClickListener{
            Log.e("GroupFrgmt","group1 ClickListener")
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGroupBinding.inflate(inflater,container,false)
        initBinding()
        return binding.root
    }
}