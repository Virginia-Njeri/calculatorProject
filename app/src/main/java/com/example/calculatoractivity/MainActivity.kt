package com.example.calculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etnum1:EditText
    lateinit var etnum2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubstract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnum1=findViewById(R.id.num1)
        etnum2=findViewById(R.id.num2)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubstract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var number1=etnum1.text.toString().toDouble()
            var number2=etnum2.text.toString().toDouble()
            addNums(number1,number2)
             }
        btnSubstract.setOnClickListener {
            var number1=etnum1.text.toString().toDouble()
            var number2=etnum2.text.toString().toDouble()
            subNums(number1,number2)
        }
        btnMultiply.setOnClickListener {
            var number1=etnum1.text.toString().toDouble()
            var number2=etnum2.text.toString().toDouble()
            multiplyNums(number1,number2)
        }
        btnModulus.setOnClickListener {
            var number1=etnum1.text.toString().toDouble()
            var number2=etnum2.text.toString().toDouble()
            modulusNums(number1,number2)

        }





    }
    fun addNums(num1:Double,num2:Double){
        var add=num1+num2
        tvResult.text=add.toString() }



    fun subNums(num1:Double,num2:Double){
        var add=num1-num2
        tvResult.text=add.toString()

        }

    fun multiplyNums(num1:Double,num2:Double){
        var add=num1*num2
        tvResult.text=add.toString()
         }

    fun modulusNums(num1:Double,num2:Double){
        var modulus=num1%num2
        tvResult.text=modulus.toString()}

}