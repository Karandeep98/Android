package com.karandeep.searchintollbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.EditText
import android.widget.SearchView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        val searchitem=menu?.findItem(R.id.menu_search)
//        if(searchitem!=null){
            val searchview=searchitem?.actionView as androidx.appcompat.widget.SearchView
            searchview.queryHint="Search Movies"
            searchview.setOnQueryTextListener(object: androidx.appcompat.widget.SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(p0: String?): Boolean {
                    val a= Intent(this@MainActivity,Search::class.java)
                    a.putExtra("searchtext",p0)
                    startActivity(a)
                    return true
                }
                override fun onQueryTextChange(p0: String?): Boolean {
                    return true
                }
            })
        return super.onCreateOptionsMenu(menu)
    }

}

