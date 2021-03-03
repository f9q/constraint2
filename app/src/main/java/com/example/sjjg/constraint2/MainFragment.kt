package com.example.sjjg.constraint2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sjjg.constraint2.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    private fun onFilterClicked(v : View){
        requireFragmentManager().beginTransaction().run {
            addToBackStack("FilgerFrmgt")
            add(R.id.root,ImageFilterFrgmt(),"FilterTag")
            commit()
        }
    }

    private fun onGroupClicked(v : View){
        requireFragmentManager().beginTransaction().run {
            addToBackStack("GroupFrmgt")
            add(R.id.root,GroupFrgmt(),"GroupTag")
            commit()
        }
    }

    private fun onFlowClicked(v : View){
        requireFragmentManager().beginTransaction().run {
            addToBackStack("FlowFrgmt")
            add(R.id.root,FlowFrgmt(),"FlowTag")
            commit()
        }
    }
    private fun onRatioClicked(v : View){
        requireFragmentManager().beginTransaction().run {
            addToBackStack("RatioFrgmt")
            add(R.id.root,RatioFrgmt(),"RatioTag")
            commit()
        }
    }
    private fun onBarrierClicked(v : View){
        requireFragmentManager().beginTransaction().run {
            addToBackStack("BarrierFrgmt")
            add(R.id.root,BarrierFrmgt(),"BarrierTag")
            commit()
        }
    }
    private fun onLayerClicked(v : View){
        requireFragmentManager().beginTransaction().run {
            addToBackStack("LayerFrgmt")
            add(R.id.root,LayerFrgmt(),"LayerTag")
            commit()
        }
    }

    fun initBinding(){
        binding.flow.setOnClickListener(this::onFlowClicked)
        binding.group.setOnClickListener(this::onGroupClicked)
        binding.ratio.setOnClickListener(this::onRatioClicked)
        binding.barrier.setOnClickListener(this::onBarrierClicked)
        binding.layer.setOnClickListener(this::onLayerClicked)
        binding.filterView.setOnClickListener(this::onFilterClicked)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater,container,false)
        initBinding()
        return binding.root
    }
}