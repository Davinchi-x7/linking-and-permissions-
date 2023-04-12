package com.example.bankreferrals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Equity_bank : AppCompatActivity() {
    lateinit var Equity:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equity)
        Equity = findViewById(R.id.equity)
        val webSettings = Equity.settings
        webSettings.javaScriptEnabled = true
        Equity.loadUrl("https://Equitybank.com")
    }
}