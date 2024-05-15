package com.deora.ktopgameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            // 1 -AdapterView:Recycler(CardView)
        val recyclerView:RecyclerView =findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,

            false
            )
            //2- DataSource:List of Games objects
        var gamesList:ArrayList<GameModel> = ArrayList()
        val g1 =GameModel(R.drawable.cube,"Horizon Chase")
        val g2 =GameModel(R.drawable.cube,"PUBG")
        val g3 =GameModel(R.drawable.cube,"HEAD Ball 2")
        val g4 =GameModel(R.drawable.cube,"FiFa 2022")
        val g5 =GameModel(R.drawable.cube,"FOrtnita")
        val g6 =GameModel(R.drawable.cube,"Hooked on you")

        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)

        //adapter
        val adapter=GameAdapter(gamesList)
        recyclerView.adapter=adapter


    }
}