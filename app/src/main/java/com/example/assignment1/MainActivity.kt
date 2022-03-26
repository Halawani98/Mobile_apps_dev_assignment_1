package com.example.assignment1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button1)
        val background: ConstraintLayout = findViewById(R.id.background)
        var flag : String = "White"
        val spinner: Spinner = findViewById(R.id.spinner1)
        val colors = arrayOf("White","Red","Green","Blue","Yellow","Orange","Purple","Pink")

        spinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,colors)

        button.setOnClickListener{
           when(flag){
               "White"->background.setBackgroundColor(Color.parseColor("#FFFFFF"))
               "Red"->background.setBackgroundColor(Color.parseColor("#FF0000"))
               "Green"->background.setBackgroundColor(Color.parseColor("#008000"))
               "Blue"->background.setBackgroundColor(Color.parseColor("#0000FF"))
               "Yellow"->background.setBackgroundColor(Color.parseColor("#FFFF00"))
               "Orange"->background.setBackgroundColor(Color.parseColor("#FFA500"))
               "Purple"->background.setBackgroundColor(Color.parseColor("#9370DB"))
               "Pink"->background.setBackgroundColor(Color.parseColor("#FFC0CB"))
           }
        }
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = colors.get(p2)
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }





    }
}