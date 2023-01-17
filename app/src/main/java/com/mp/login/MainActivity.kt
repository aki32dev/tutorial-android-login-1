package com.mp.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.mp.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initButton()
        initEditText()
        initCheckBox()
    }

    private fun initButton() {
        binding.btnLogin.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initEditText() {
        binding.etEmail.doOnTextChanged { text, _, _, _ ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }

        binding.etPassword.doOnTextChanged { text, _, _, _ ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    private fun initCheckBox() {
        binding.cbRemember.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, isChecked.toString(), Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, isChecked.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}