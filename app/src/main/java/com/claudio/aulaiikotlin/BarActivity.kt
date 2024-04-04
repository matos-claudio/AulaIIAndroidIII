package com.claudio.aulaiikotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.claudio.aulaiikotlin.databinding.ActivityBarBinding

class BarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            barChart.animation.duration = 2000
            barChart.animate(barSet)
//            barChart.show(barSet)
        }

    }

    companion object {
        private val barSet = listOf(
            "JAN" to 5F,
            "FEV" to 8.70F,
            "MAR" to 7.56F,
            "ABR" to 5F,
            "MAI" to 1F,
        )
    }
}