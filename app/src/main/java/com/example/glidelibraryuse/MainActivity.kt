package com.example.glidelibraryuse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //with : Parametre olarak Activity veya fragment bekler
        //load : Kaynağın(görselin) yolu
        //skipMemoryCache : Kaynaktaki görüntüyü ön belleğe alır
        //transform(CircleCrop()) : Görüntüyü yuvarlak olarak kırpar
        //into : Parametre olarak load ile alınan görselin içeriğinin nerede gösterileceğinin bilgisiniz alır
        Glide.with(this)
            .load("https://i.imgur.com/tGbaZCY.jpg")
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .transform(CircleCrop())
            .into(imageView)
    }
}
