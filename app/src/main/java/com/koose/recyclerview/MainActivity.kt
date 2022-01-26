package com.koose.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.koose.recyclerview.adapter.ImageFromNetAdapter
import com.koose.recyclerview.model.ImageFromNet

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val imgFromNet = ArrayList<ImageFromNet>()
        imgFromNet.add(
            ImageFromNet(
                "https://static.wikia.nocookie.net/lotr-minecraft-mod-exiles/images/6/6a/Java-logo.jpg/revision/latest?cb=20190430152935",
                "Java",
                "Currently, about 3 billion mobile phones are working in Java, as well as 125 million TV sets and each Blu-Ray player. This language is continually ranked first in the rankings of software developers as the best choice of programming languages."
            )
        )
        imgFromNet.add(
            ImageFromNet(
                "https://www.currentschoolnews.com/wp-content/uploads/2020/02/GettyImages-977644614-800x869-1.jpg",
                "Python",
                "\n" +
                        "Python is the older of the two languages, first released in 1991 by its inventor, Guido van Rossum. It has been open source since its inception. "
            )
        )
        imgFromNet.add(
            ImageFromNet(
                "https://www.edureka.co/blog/wp-content/uploads/2019/08/Kotlin-Andriod-Tutorial-PNG.png",
                "Kotlin",
                "Official Language by Google annouced on 2016"
            )
        )

        val adaptr = ImageFromNetAdapter(this, imgFromNet)

        recyclerView.adapter = adaptr

    }
}