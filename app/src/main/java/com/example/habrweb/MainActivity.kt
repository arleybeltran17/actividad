package com.example.habrweb

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn:Button=findViewById(R.id.btn1)
        btn.setOnClickListener{suma()}
    }
    fun suma(){
        val num1:EditText=findViewById(R.id.num1)
        val num2:EditText=findViewById(R.id.num2)
        val result:TextView=findViewById(R.id.txt3)

        var num1parse=num1.text.toString()
        var num1entero=num1parse.toInt()

        var num2parse=num2.text.toString()
        var num2entero=num2parse.toInt()






        result.text=(" $num1 y $num2")
    }

}