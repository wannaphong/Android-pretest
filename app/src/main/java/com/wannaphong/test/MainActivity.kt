package com.wannaphong.test

import android.content.Intent
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
        flower.add(Flower("ดอกดาวเรือง",R.drawable.f1))
        flower.add(Flower("ดอกกล้วยไม้",R.drawable.f2))

        var listview:ListView = findViewById(R.id.itemlist)

        listview.adapter = FlowerAdapter(
            this,
            R.layout.activity_listitem_flower,
            flower
        )
        listview.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this,position.toString(),Toast.LENGTH_SHORT).show()
            if (position == 0) {
                var i = Intent(this, Show::class.java)
                i.putExtra("name", flower[0].name)
                i.putExtra("img", flower[0].icon)
                startActivity(i)
            } else if (position == 1) {
                var i = Intent(this, Show::class.java)
                i.putExtra("name", flower[1].name)
                i.putExtra("img", flower[1].icon)
                startActivity(i)
            }
        }
    }
}
