package com.basiccodist.datashareintent_master

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val m_message = intent.getStringExtra("message")
        val messageText = findViewById<TextView>(R.id.textView) as TextView
        messageText.text = m_message
    }
}