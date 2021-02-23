package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*
//import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn00: Button = findViewById(R.id.btn00)
        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)
        val btnPlus: Button = findViewById(R.id.btnPlus)
        val btnMinus: Button = findViewById(R.id.btnMinus)
        val btnMultiply: Button = findViewById(R.id.btnMultiply)
        val btnDivide: Button = findViewById(R.id.btnDivide)
        val btnLeftB: Button = findViewById(R.id.btnLeftB)
        val btnRightB: Button = findViewById(R.id.btnRightB)
        val btnClear: Button = findViewById(R.id.btnClear)
        val btnEqual: Button = findViewById(R.id.btnEqual)

        btn00.setOnClickListener{}
        btn0.setOnClickListener {}
        btn1.setOnClickListener {}
        btn2.setOnClickListener {}
        btn3.setOnClickListener {}
        btn4.setOnClickListener {}
        btn5.setOnClickListener {}
        btn6.setOnClickListener {}
        btn7.setOnClickListener {}
        btn8.setOnClickListener {}
        btn9.setOnClickListener {}

        btnPlus.setOnClickListener {}
        btnMinus.setOnClickListener {}
        btnMultiply.setOnClickListener {}
        btnDivide.setOnClickListener {}
        btnLeftB.setOnClickListener {}
        btnRightB.setOnClickListener {}
        btnClear.setOnClickListener {}
        btnEqual.setOnClickListener {}
    }
}