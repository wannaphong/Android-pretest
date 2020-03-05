package com.wannaphong.test

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_show.*


class Show : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        val name = intent.getStringExtra("name")
        val img:Int= intent.getIntExtra("img",0)
        imgshow.setImageDrawable(this.getDrawable(img))

        imgname.text = name
    }
}
