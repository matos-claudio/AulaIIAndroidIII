package com.claudio.aulaiikotlin

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.claudio.aulaiikotlin.databinding.ActivityLineBinding

class LineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lineSet = listOf("Arroz" to 4.5F, "Tomate" to 5.7F, "Biscoito" to 8.2F, "Carne" to 10.8F, "Feijão" to 7.5F)

        binding.apply {
            lineChart.gradientFillColors = intArrayOf(
                Color.parseColor("#6485f6"),
                Color.TRANSPARENT
            )
            lineChart.animation.duration = 1000
            lineChart.animate(lineSet)
            lineChart.onDataPointTouchListener={index, x, y ->
                tvValue.text = lineSet.toList()[index].second.toString()
            }



        }
    }
}