package com.example.mini_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.items_list)
        val items = arrayListOf<Item>()

        items.add(Item(1, "sofa", "Sofa", "This is sofa", "Buy sofa", 400))
        items.add(Item(2, "bed", "Bed", "This is bed", "Buy bed", 500))
        items.add(Item(3, "table", "Table", "This is table", "Buy table", 900))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}