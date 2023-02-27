package com.example.intent_types

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import second_act

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.button)
        val text=findViewById<EditText>(R.id.editText)

btn.setOnClickListener(View.OnClickListener {

    val i=Intent(Intent.ACTION_VIEW, Uri.parse(text.toString()))
    startActivity(i)
})
    }

    fun second(view: View) {
        val i=Intent(this,second_act::class.java)
        startActivity(i)
    }
}