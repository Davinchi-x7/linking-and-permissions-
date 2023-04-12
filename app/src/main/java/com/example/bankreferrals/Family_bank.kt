package com.example.bankreferrals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Family_bank : AppCompatActivity() {
    lateinit var Family:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_bank)
        Family = findViewById(R.id.FamWeb)
        val webSettings = Family.settings
        webSettings.javaScriptEnabled = true
        Family.loadUrl("https://familybank.com")
    }
}
