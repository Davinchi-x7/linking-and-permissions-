package com.example.bankreferrals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Stanbic_bank : AppCompatActivity() {
    lateinit var Stanbic:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stanbic)
        Stanbic = findViewById(R.id.Stanbic)
        val webSettings = Stanbic.settings
        webSettings.javaScriptEnabled = true
        Stanbic.loadUrl("https://Stanbicbank.com")
    }
}