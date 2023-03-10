package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()

    }

    private fun initClickers() {
        with(binding){
            btnCalculate.setOnClickListener {
                textMain.text = Math().add(firstNum.text.toString(),secondNum.text.toString())
            }
            btnDivide.setOnClickListener {
                textMain.text = Math().divide(firstNum.text.toString(),secondNum.text.toString())
            }
        }
    }
}