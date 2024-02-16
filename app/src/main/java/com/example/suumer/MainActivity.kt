package com.example.suumer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberInput1 = findViewById<EditText>(R.id.numberInput1)
        val numberInput2 = findViewById<EditText>(R.id.numberInput2)
        val sumButton = findViewById<Button>(R.id.sumButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        sumButton.setOnClickListener {
            try {
                val num1 = numberInput1.text.toString().toDouble()
                val num2 = numberInput2.text.toString().toDouble()
                val sum = num1 + num2
                resultText.text = "$num1 + $num2 = $sum"
            } catch (e: NumberFormatException) {
                resultText.text = "Пожалуйста, введите корректные числовые значения."
            }
        }
    }
}