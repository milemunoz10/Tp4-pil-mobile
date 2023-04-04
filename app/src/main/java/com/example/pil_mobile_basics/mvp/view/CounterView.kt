package com.example.pil_mobile_basics.mvp.view

import android.app.Activity
import com.example.pil_mobile_basics.databinding.ActivityMainBinding
import com.example.pil_mobile_basics.mvp.contract.CounterContract
import com.example.pil_mobile_basics.mvp.view.base.ActivityView

class CounterView(activity: Activity) : ActivityView(activity), CounterContract.View {
    private var binding: ActivityMainBinding =
        ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun showCounterValue(value: String) {
        binding.valueToIncrement.text = value
    }

    override fun onIncrementClicked(onClick: ()-> Unit){
        binding.incrementButton.setOnClickListener {(onClick())}
    }

    override fun onDecrementClicked(onClick: ()-> Unit){
        binding.decrementButton.setOnClickListener {(onClick())}
    }
    override fun onResetClicked(onClick: ()-> Unit){
        binding.resetButton.setOnClickListener {(onClick())}
    }

    override fun valueIsEmpty(): Boolean {
        binding.valueToIncrement.text.isBlank()
    }

    override fun getEmptyError(){
        binding.valueToIncrement.error = "Complete"
    }

    override fun clear(){
        binding.valueToIncrement.text.clear()
    }
}


