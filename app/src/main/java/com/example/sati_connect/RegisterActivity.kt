
package com.example.sati_connect

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register3)
        window.statusBarColor = Color.TRANSPARENT

        val textInputLayout: TextInputLayout? = findViewById(R.id.textField)
        val textInputEditText: TextInputEditText? = findViewById(R.id.textInputEditText)

        textInputLayout?.let { layout ->
            // Work with TextInputLayout
        }

        textInputEditText?.let { editText ->
            // Work with TextInputEditText
        }
    }
}
