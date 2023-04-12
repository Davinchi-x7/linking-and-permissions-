package com.example.bankreferrals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class KCB_bank : AppCompatActivity() {
    lateinit var KCB:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)
        KCB = findViewById(R.id.KCB)
        val webSettings = KCB.settings
        webSettings.javaScriptEnabled = true
        KCB.loadUrl("https://KCBbank.com")
    }
}