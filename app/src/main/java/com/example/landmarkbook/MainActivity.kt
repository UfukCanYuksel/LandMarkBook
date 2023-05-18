package com.example.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var landArray: ArrayList<LandMark>
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        landArray = ArrayList<LandMark>()

        //Data
        val pisa = LandMark("Pisa","Italy",R.drawable.pisa)
        val colosseum = LandMark("Colosseum" , "Italy" , R.drawable.colosseum)
        val eyfel = LandMark ( "Eyfel" , "France" , R.drawable.eyfel)


        landArray.add(pisa)
        landArray.add(colosseum)
        landArray.add(eyfel)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerAdapter(landArray)
        binding.recyclerView.adapter = adapter


    }
}