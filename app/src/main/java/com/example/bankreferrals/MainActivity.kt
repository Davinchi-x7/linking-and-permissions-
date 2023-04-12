package com.example.bankreferrals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Family:Button
    lateinit var Coop:Button
    lateinit var Absa:Button
    lateinit var Stan:Button
    lateinit var KCB:Button
    lateinit var Equity:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Family = findViewById(R.id.Fam_btn)
        Coop = findViewById(R.id.Coop_btn)
        Absa = findViewById(R.id.Absa_btn)
        Stan = findViewById(R.id.Stan_btn)
        KCB = findViewById(R.id.kcb_btn)
        Equity = findViewById(R.id.Equity_btn)

        Family.setOnClickListener(){
            val gotoFamilybank = Intent(this,Family_bank::class.java)
            startActivity(gotoFamilybank)
        }
        Coop.setOnClickListener(){
            val gotoCoop_bank = Intent(this, coop_bank::class.java)
            startActivity(gotoCoop_bank)
        }
        Absa.setOnClickListener(){
            val gotoAbsa_bank = Intent(this, Absa_bank::class.java)
            startActivity(gotoAbsa_bank)
        }
        Coop.setOnClickListener(){
            val gotoStanbic_bank = Intent(this, Stanbic_bank::class.java)
            startActivity(gotoStanbic_bank)
        }
        Coop.setOnClickListener(){
            val gotoKCB = Intent(this, KCB_bank::class.java)
            startActivity(gotoKCB)
        }
        Coop.setOnClickListener(){
            val gotoEquity_bank = Intent(this, Equity_bank::class.java)
            startActivity(gotoEquity_bank)
        }

    }
}