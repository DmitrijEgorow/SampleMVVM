package ru.myitschool.lab23.presentation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import ru.myitschool.lab23.R


class MainActivity : AppCompatActivity() {

    private val registerViewModel: RegisterViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.register_text)

        registerViewModel.registerState.observe(this) { newText ->
            textView.text = newText
        }

    }
}

// Presentation -> Domain -> Data
