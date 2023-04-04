package com.example.pil_mobile_basics.mvp.model

import com.example.pil_mobile_basics.mvp.contract.CounterContract

class CounterModel : CounterContract.Model {
    private var counterValue = 0

    override fun getCounterValue() : String = counterValue.toString()

    override fun incrementCounter(value: Int) {
        counterValue += value
    }

    override fun decrementCounter(value: Int) {
        counterValue -= value
    }

    override fun resetCounter() {
        counterValue = 0
    }
}