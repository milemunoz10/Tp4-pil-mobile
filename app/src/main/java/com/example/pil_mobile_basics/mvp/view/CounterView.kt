package com.example.pil_mobile_basics.mvp.view

import android.app.Activity
import com.example.pil_mobile_basics.mvp.contract.CounterContract
import com.example.pil_mobile_basics.mvp.view.base.ActivityView

class CounterView(activity: Activity) : ActivityView(activity), CounterContract.View {
    private var binding: ActivityMainBinding =
        ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun showCounterValue(value: String) {
        binding.value.text = value
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

    override fun valueIsEmpty() : Boolean {
        binding.inserText.text.isBlank()
    }

    override fun getEmptyError(){
        binding.inputNumber.error = "Complete"
    }

    override fun clear(){
        binding.inputNumber.text.clear()
    }
}


