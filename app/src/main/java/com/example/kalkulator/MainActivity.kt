package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewsById(R.id.resultTextView)
        private
    }
    fun numberClick(clickedView: View) {
        if (clickedView is TextView)
            val result = resultTextView.text.toString()
            val number = clickedView.text.toString()
        if (result == "0"){
            result = ""
        }
        resultTextView.text = result + number
    }
    fun operationClick(clicView: View) {
        val secOperandText: String = resultTextViews.text.toString()
        var sec0perand= Double = 0.0
        if (secOperandtext: isNotEmpty()){

              secOperand = sec0perandText.toDouble()
            }
        when (operation) {
            "+" -> resultTextVie.text =  (operand + secOperand).toString()
            "-" ->  resultTextVie.text = (operand - secOperand).toString()
            "X"  ->  resultTextVie.text = (operand = secOperand).toString()
            "/"  -> resultTextVie.text = (operand = secOperand).toString()
        }
    }