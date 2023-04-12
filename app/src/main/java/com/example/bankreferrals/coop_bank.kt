package com.example.bankreferrals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class coop_bank : AppCompatActivity() {
    lateinit var Coop:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coop_bank)

        Coop = findViewById(R.id.Coop)
        val webSettings = Coop.settings
        webSettings.javaScriptEnabled = true
        Coop.loadUrl("https://cooperativebank.com")
    }
}