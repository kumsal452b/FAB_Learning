package com.kumsal.fab_learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var fab: FloatingActionButton
    private lateinit var fab1: FloatingActionButton
    private lateinit var fab2: FloatingActionButton
    private lateinit var fab3: FloatingActionButton
    var isOpen:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fab = findViewById(R.id.fab)
        fab1 = findViewById(R.id.fab1)
        fab2 = findViewById(R.id.fab2)
        fab3 = findViewById(R.id.fab3)

        fab2.alpha = 0F
        fab3.alpha = 0F
        fab1.alpha = 0F

        fab3.translationY=100F
        fab2.translationY=100F
        fab1.translationY=100F

        fab.setOnClickListener(this)
        fab1.setOnClickListener(this)
        fab2.setOnClickListener(this)
        fab3.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fab ->
                println("fab")
            R.id.fab1 ->
                println("fab1")
            R.id.fab2 ->
                println("fab2")
            R.id.fab3 ->
                println("fab3")

        }
    }
}