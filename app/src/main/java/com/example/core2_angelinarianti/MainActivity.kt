package com.example.core2_angelinarianti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var gwoc = Building("Great Wall Of China",  "Huairou District, China", 4, "18-12-2009")
    var eiffel = Building("Eiffel Tower",  "Paris, France", 4, "23-10-2012")
    var colosseum = Building("Colosseum",  "Roma, Italy", 5, "29-10-2012")
    var opera = Building("Sydney Opera House", "Sydney, Australia", 4, "10-07-2019")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iv_gwoc = findViewById<ImageView>(R.id.image_gwoc)
        iv_gwoc.setOnClickListener {
            val i = Intent(this, DetailedActivity::class.java).apply {
                putExtra("building", gwoc)
            }
            startActivity(i)
        }

        val iv_eiffel = findViewById<ImageView>(R.id.image_eiffel)
        iv_eiffel.setOnClickListener {
            val i = Intent(this, DetailedActivity::class.java).apply {
                putExtra("building", eiffel)
            }
            startActivity(i)
        }

        val iv_colosseum = findViewById<ImageView>(R.id.image_colosseum)
        iv_colosseum.setOnClickListener {
            val i = Intent(this, DetailedActivity::class.java).apply {
                putExtra("building", colosseum)
            }
            startActivity(i)
        }

        val iv_opera = findViewById<ImageView>(R.id.image_opera)
        iv_opera.setOnClickListener {
            val i = Intent(this, DetailedActivity::class.java).apply {
                putExtra("building", opera)
            }
            startActivity(i)
        }
    }
}