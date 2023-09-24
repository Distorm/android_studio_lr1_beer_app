package com.example.lr1_beer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val find_ber = findViewById<Button>(R.id.btn_main)
        val find_text = findViewById<TextView>(R.id.tx_main_info)
        val find_spinner = findViewById<Spinner>(R.id.sp_beer_color)

        find_ber.setOnClickListener(){
            val get_text_all = find_spinner.selectedItem
            find_text.text = get_text_all.toString()
            //get_text_all.text = get_beers()
        }
    }

    fun get_beers(get_text: String): List<String> {
        return when (get_text) {
            "Light" -> listOf("Jail pale ale", "Lager lite")
            "Amber" -> listOf("Jack Amber", "Red Moose")
            "Brown" -> listOf("Brown Bear Beer", "Bock Brownie")
            else -> listOf("Gout stout", "Dark Daniel")
        }
    }
}