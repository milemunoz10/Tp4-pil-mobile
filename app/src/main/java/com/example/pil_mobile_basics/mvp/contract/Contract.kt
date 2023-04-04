package com.example.pil_mobile_basics.mvp.contract

interface Contract {
    interface View{
        fun showCounterValue(value: String)
        fun onIncrementClicked(function: () -> Unit)
        fun onDecrementClicked(function: () -> Unit)
        fun onResetClicked(function: () -> Unit)
        fun valueIsEmpty(): Boolean
        fun getEmptyError()
        fun clear()
    }

    interface Presenter{
        fun onIncrementClicked(value: String)
        fun onDecrementClicked(value: String)
        fun onResetClicked()
        fun onIncrementClicked()
    }

    interface Model{
        fun getCounterValue() : String
        fun incrementCounter(value: Int)
        fun decrementCounter(value: Int)
        fun resetCounter()
        fun incrementCounter() {
            TODO("Not yet implemented")
        }

        fun decrementCounter() {
            TODO("Not yet implemented")
        }
    }
}