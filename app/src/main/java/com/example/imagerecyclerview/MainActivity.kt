package com.example.imagerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imagerecyclerview.adapter.PersonAdapter
import com.example.imagerecyclerview.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var personList = ArrayList<Person>()
        personList.add(Person("biography",R.drawable.b))
        personList.add(Person("coupon",R.drawable.c))

        personList.add(Person("coupon",R.drawable.d))

        personList.add(Person("My list",R.drawable.ic_baseline_list_alt_24))
        personList.add(Person("Activity",R.drawable.ic_baseline_local_activity_24))

        personList.add(Person("Laptop",R.drawable.ic_baseline_laptop_windows_24))

        personList.add(Person("Music",R.drawable.ic_baseline_library_music_24))
        personList.add(Person("Bar",R.drawable.ic_baseline_local_bar_24))

        personList.add(Person("Cafe",R.drawable.ic_baseline_local_cafe_24))


//        recycleView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,
//        false)
//        recycleView.layoutManager = LinearLayoutManager(this)

        recycleView.layoutManager = GridLayoutManager(this,3)

        recycleView.adapter = PersonAdapter(personList)




    }

}