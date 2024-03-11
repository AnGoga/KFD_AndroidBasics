package com.angoga.kfd_androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btnPlus: Button
    private lateinit var btnMinus: Button
    private lateinit var btnMulti: Button
    private lateinit var btnDiv: Button

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText

    private lateinit var textViewResult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        btnPlus.setOnClickListener {
            val num1 = editText1.text.toString().toInt()
            val num2 = editText2.text.toString().toInt()
            textViewResult.text = (num1 + num2).toString()
        }
        btnMinus.setOnClickListener {
            val num1 = editText1.text.toString().toInt()
            val num2 = editText2.text.toString().toInt()
            textViewResult.text = (num1 - num2).toString()
        }
        btnDiv.setOnClickListener {
            val num1 = editText1.text.toString().toInt()
            val num2 = editText2.text.toString().toInt()
            textViewResult.text = (num1 / num2).toString()
        }
        btnMulti.setOnClickListener {
            val num1 = editText1.text.toString().toInt()
            val num2 = editText2.text.toString().toInt()
            textViewResult.text = (num1 * num2).toString()
        }
    }

    private fun initView() {
        btnPlus = findViewById(R.id.btn_plus)
        btnMinus = findViewById(R.id.btn_minus)
        btnMulti = findViewById(R.id.btn_multi)
        btnDiv = findViewById(R.id.btn_div)
        editText1 = findViewById(R.id.field1)
        editText2 = findViewById(R.id.field2)
        textViewResult = findViewById(R.id.text_result)
    }
}