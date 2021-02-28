package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnE: Button = findViewById(R.id.btnE)
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
        val btnDot: Button = findViewById(R.id.btnDot)
        val btnPie: Button = findViewById(R.id.btnPie)
        val btnSin: Button = findViewById(R.id.btnSin)
        val btnCos: Button = findViewById(R.id.btnCos)
        val btnLog: Button = findViewById(R.id.btnLog)

        btnE.setOnClickListener { appendText(true, "e") }
        btn0.setOnClickListener { appendText(true, "0") }
        btn1.setOnClickListener { appendText(true, "1") }
        btn2.setOnClickListener { appendText(true, "2") }
        btn3.setOnClickListener { appendText(true, "3") }
        btn4.setOnClickListener { appendText(true, "4") }
        btn5.setOnClickListener { appendText(true, "5") }
        btn6.setOnClickListener { appendText(true, "6") }
        btn7.setOnClickListener { appendText(true, "7") }
        btn8.setOnClickListener { appendText(true, "8") }
        btn9.setOnClickListener { appendText(true, "9") }
        btnDot.setOnClickListener { appendText(true, ".") }
        btnPie.setOnClickListener { appendText(true, "π") }
        btnSin.setOnClickListener { appendText(true, "sin(") }
        btnCos.setOnClickListener { appendText(true, "cos(") }
        btnLog.setOnClickListener { appendText(true, "log(") }

        btnPlus.setOnClickListener { appendText(false, "+") }
        btnMinus.setOnClickListener { appendText(false, "-") }
        btnMultiply.setOnClickListener { appendText(false, "×") }
        btnDivide.setOnClickListener { appendText(false, "÷") }
        btnLeftB.setOnClickListener { appendText(false, "(") }
        btnRightB.setOnClickListener { appendText(false, ")") }
        btnClear.setOnClickListener { handleClear() }
        btnEqual.setOnClickListener { calculate() }
    }

    fun appendText(clear: Boolean, string: String) {
        val tvInput: TextView = findViewById(R.id.tvInput)
        val tvOutput: TextView = findViewById(R.id.tvOutput)

        if (clear) {
            tvOutput.text = ""
            tvInput.append(string)
        } else {
            tvInput.append(tvOutput.text)
            tvInput.append(string)
            tvOutput.text = ""
        }
    }

    fun handleClear() {
        val tvInput: TextView = findViewById(R.id.tvInput)
        val tvOutput: TextView = findViewById(R.id.tvOutput)

        tvInput.text = ""
        tvOutput.text = ""
    }

    fun calculate() {
        val tvInput: TextView = findViewById(R.id.tvInput)
        val tvOutput: TextView = findViewById(R.id.tvOutput)

        try {
            val input = ExpressionBuilder(
                tvInput.text.toString().replace("÷", "/").replace("×", "*")
            ).build()
            val output = input.evaluate()
            val longOutput = output.toLong()
            if (output == longOutput.toDouble()) {
                tvOutput.text = longOutput.toString()
                tvInput.text = ""
            } else {
                tvOutput.text = output.toString().take(12)
                tvInput.text = ""
            }

        } catch (e: Exception) {
            Toast.makeText(this@MainActivity, "計算式が正しくありません", Toast.LENGTH_LONG).show()
        }
    }
}