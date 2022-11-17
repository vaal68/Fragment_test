package com.example.fragment_test

//Переход между фрагментам по кнопке Registration, стек работает, по кнопке назад возврат к первому фрагменту

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainerView, FirstFragment())
            .addToBackStack("firstFragment")
            .commit()
    }
}