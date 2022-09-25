package com.example.core2_angelinarianti

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import java.util.*

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val building = intent.getParcelableExtra<Building>("building")

        building?.let {
            val vName = findViewById<TextView>(R.id.details_name)
            vName.text = it.name

            val vImage = findViewById<ImageView>(R.id.details_image)
            vImage.setImageDrawable(when (it.name) {
                "Great Wall Of China" -> getDrawable(R.drawable.great_wall_of_china)
                "Eiffel Tower" -> getDrawable(R.drawable.paris_eiffel_tower)
                "Rome Colosseum" -> getDrawable(R.drawable.rome_colosseum)
                "Sydney Opera House" -> getDrawable(R.drawable.sydney_opera_house)
                else -> getDrawable(R.drawable.great_wall_of_china)
            })

            val vLocation = findViewById<TextView>(R.id.details_location)
            vLocation.text = it.location

            val vRatings = findViewById<RatingBar>(R.id.details_ratings)
            vRatings.setRating(it.ratings.toFloat())

            val vDate = findViewById<TextView>(R.id.details_date)
            vDate.text = it.date
        }
    }
}