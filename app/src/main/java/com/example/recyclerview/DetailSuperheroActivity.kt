package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.ImageView
import android.widget.TextView

class DetailSuperheroActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableExtra<Superhero>(MainActivity.INTENT_PARCELABLE)

        val imgSuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = findViewById<TextView>(R.id.tv_item_description)

        imgSuperhero.setImageResource(superhero?.imgSuperhero!!)
        nameSuperhero.text = superhero.nameSuperhero
        descSuperhero.text = superhero.descSuperhero

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DetailSuperheroActivity> {
        override fun createFromParcel(parcel: Parcel): DetailSuperheroActivity {
            return DetailSuperheroActivity(parcel)
        }

        override fun newArray(size: Int): Array<DetailSuperheroActivity?> {
            return arrayOfNulls(size)
        }
    }
}