package com.example.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = Toast.makeText(applicationContext,"Can't increase more than 9.", Toast.LENGTH_LONG)
        val b = Toast.makeText(applicationContext,"Can't decrease more than 0.", Toast.LENGTH_LONG)
        val c = Toast.makeText(applicationContext,"The number has been reset.", Toast.LENGTH_LONG)
        var count = 0

        button1.setOnClickListener(){
            if (count >= 0 && count < 9){
                count++
                text1.setText("$count")
            }else{
                a.show()
            }
        }


        button2.setOnClickListener(){
            if (count > 0 && count <= 9){
                count--
                text1.setText("$count")
            }else{
                b.show()
            }
        }


        button3.setOnClickListener(){
            count = 0
            text1.setText("$count")
            c.show()

        }

    }

}