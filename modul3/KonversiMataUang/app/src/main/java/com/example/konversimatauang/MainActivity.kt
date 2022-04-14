package com.example.konversimatauang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konversimatauang.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.konversiButton.setOnClickListener { konversi() }
    }

    fun konversi() {
        val value = binding.nilai.text.toString().toDoubleOrNull()
        if (value == null) {
            binding.result.text = ""
            return
        }
        val selectedCurrency = when (binding.currencyOptions.checkedRadioButtonId) {
            R.id.option_euro -> 15617.58
            R.id.option_us_dollar -> 14355.25
            R.id.option_japanese_yen -> 114.69
            else -> 3827.98
        }
        val result = value * selectedCurrency
        val indonesianLocale = Locale("in", "ID")
        val formattedResult = NumberFormat.getCurrencyInstance(indonesianLocale).format(result)
        binding.result.text = getString(R.string.nilai_rupiah, formattedResult)
    }
}