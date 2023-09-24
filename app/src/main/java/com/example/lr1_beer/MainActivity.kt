package com.example.lr1_beer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
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
            val get_text_all = find_spinner.selectedItem.toString()
            val get_view = get_beers(get_text_all)
            val beers = get_view.reduce{ string, element -> string + '\n' + element}
            find_text.text = beers

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