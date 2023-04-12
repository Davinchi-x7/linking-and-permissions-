package com.example.bankreferrals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Absa_bank : AppCompatActivity() {
    lateinit var ABSA:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absa)
        ABSA = findViewById(R.id.ABSA)
        val webSettings = ABSA.settings
        webSettings.javaScriptEnabled = true
        ABSA.loadUrl("https://ABSAbank.com")
    }
}