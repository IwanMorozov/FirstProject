package com.example.firstproject

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Lifecycle","onCreate вызван")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val editText = findViewById<AppCompatEditText>(R.id.editText)
        outState.putString("USER_INPUT", editText.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val editText = findViewById<AppCompatEditText>(R.id.editText)
        val savedText = savedInstanceState.getString("USER_INPUT")
        editText.setText(savedText)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle","onStart вызван")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle","onResume вызван")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle","onPause вызван")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle","onStop вызван")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle","onDestroy вызван")
    }
}