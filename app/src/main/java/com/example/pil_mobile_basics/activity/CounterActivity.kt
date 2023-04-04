package com.example.pil_mobile_basics.activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.leanback.widget.Presenter
import com.example.pil_mobile_basics.mvp.model.Model


class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Presenter(Model(), View(this))
    }

}