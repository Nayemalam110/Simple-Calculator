package com.example.simplecalcultor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    private lateinit var btnPlus : Button
    private lateinit var btnMinus : Button
    private lateinit var btnMulti : Button
    private lateinit var btnDiv : Button
    private lateinit var ed1 : TextInputEditText
    private lateinit var ed2 : TextInputEditText
    private lateinit var result : TextView
    var input1 = 0
    var input2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnDiv = findViewById(R.id.btnDiv)
        btnMulti = findViewById(R.id.btnMul)
        ed1 = findViewById(R.id.ed1)
        ed2 = findViewById(R.id.ed2)
        result=findViewById(R.id.resultId)
        btnPlus.setOnClickListener {

            input1 = ed1.text.toString().toInt()
            input2 = ed2.text.toString().toInt()

            result.text = (input1+input2).toString()
            ed1.setText("0")
            ed2.setText("0")
        }
        btnMinus.setOnClickListener {

            input1 = ed1.text.toString().toInt()
            input2 = ed2.text.toString().toInt()

            result.text = (input1-input2).toString()
            ed1.setText("0")
            ed2.setText("0")
        }
        btnMulti.setOnClickListener {

            input1 = ed1.text.toString().toInt()
            input2 = ed2.text.toString().toInt()

            result.text = (input1*input2).toString()
            ed1.setText("0")
            ed2.setText("0")
        }
        btnDiv.setOnClickListener {

            input1 = ed1.text.toString().toInt()
            input2 = ed2.text.toString().toInt()

            result.text = (input1/input2).toString()
           ed1.setText("0")
            ed2.setText("0")
        }

    }
}