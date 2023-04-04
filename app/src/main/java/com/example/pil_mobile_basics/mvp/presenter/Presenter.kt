package com.example.pil_mobile_basics.mvp.presenter

import com.example.pil_mobile_basics.mvp.contract.Contract

class Presenter (
    private val model: Contract.Model, 
    private val view: Contract.View):

    Contract.Presenter{

    init {
            view.onIncrementClicked { onIncrementClicked() }
            view.onDecrementClicked { onDecrementClicked() }
            view.onResetClicked { onResetClicked() }
    }


    override fun onIncrementClicked(value: String) {
            if(view.valueIsEmpty()){
                view.getEmptyError()
            } else {
                model.incrementCounter()
                view.showCounterValue(model.getCounterValue())
            }
    }

    override fun onIncrementClicked() {
        TODO("Not yet implemented")
    }

    override fun onDecrementClicked(value: String) {
            if(view.valueIsEmpty()){
                view.getEmptyError()
            } else {
                model.decrementCounter()
                view.showCounterValue(model.getCounterValue())
            }
    }

    override fun onResetClicked() {
            view.clear()
    }

}
