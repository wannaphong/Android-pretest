package com.wannaphong.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.wannaphong.test.Adapter.FlowerAdapter
import com.wannaphong.test.Model.Flower

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flower:MutableList<Flower> = mutableListOf<Flower>()
        flower.add(Flower("ดอกดาวเรือง",R.mipmap.ic_launcher))
        flower.add(Flower("ดอกกล้วยไม้",R.mipmap.ic_launcher))

        var listview:ListView = findViewById(R.id.itemlist)

        listview.adapter = FlowerAdapter(
            this,
            R.layout.activity_listitem_flower,
            flower
        )
    }
}
