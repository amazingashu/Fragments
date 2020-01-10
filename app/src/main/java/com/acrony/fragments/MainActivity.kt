package com.acrony.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var IsFragmentloaded=true

    val manager=supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val FragmentChanger=findViewById<Button>(R.id.btnChanger)

        DisplayFragmentOne()

        FragmentChanger.setOnClickListener({
            if(IsFragmentloaded)
                DisplayFragmentTwo()
            else
                DisplayFragmentOne()

        })
    }

    fun DisplayFragmentOne(){


        val transaction=manager.beginTransaction()

        val fragment=First_Fragment()

        transaction.replace(R.id.Frag_Holder,fragment)

        transaction.addToBackStack(null)

        transaction.commit()

        IsFragmentloaded=true
    }

    fun DisplayFragmentTwo(){

        val transaction=manager.beginTransaction()
        val fragment=Second_Fragment()
        transaction.replace(R.id.Frag_Holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        IsFragmentloaded=false
    }
}
