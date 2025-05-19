package com.apptailors.pinblocktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val input by lazy { findViewById<EditText>(R.id.main_input) }
    private val run by lazy { findViewById<Button>(R.id.main_run) }
    private val output by lazy { findViewById<TextView>(R.id.main_output) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}