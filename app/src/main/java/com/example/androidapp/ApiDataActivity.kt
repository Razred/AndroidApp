package com.example.androidapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidapp.fragments.MainFragment

class ApiDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_data)
        supportFragmentManager
            .beginTransaction().replace(R.id.tabLayout, MainFragment.newInstance()).commit()
    }


}