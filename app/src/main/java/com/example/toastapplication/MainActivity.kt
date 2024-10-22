package com.example.toastapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.toastapplication.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonApply.setOnClickListener {
            val name = binding.editName.text.toString().trim()
            val lastName = binding.editLastname.text.toString().trim()

            if(name.isEmpty() || lastName.isEmpty()) {
              binding.plainTextResult.text = "Nome não inserido"
                Toast.makeText(applicationContext, "Nome não inserido", Toast.LENGTH_SHORT).show()
            } else {
                binding.plainTextResult.text = "Olá $name $lastName"
                Toast.makeText(applicationContext, "Olá $name $lastName", Toast.LENGTH_LONG).show()
            }
        }
    }
}
