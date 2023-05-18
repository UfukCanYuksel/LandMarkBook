package com.example.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landmarkbook.databinding.ActivityDetailsActivyBinding

class DetailsActivy : AppCompatActivity() {
    lateinit var binding: ActivityDetailsActivyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_activy)
        binding = ActivityDetailsActivyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val landmark = intent.getSerializableExtra("landmark") as LandMark
        binding.tvName.text = landmark.name
        binding.tvCountry.text = landmark.country
        binding.imageView.setImageResource(landmark.image   )


    }
}