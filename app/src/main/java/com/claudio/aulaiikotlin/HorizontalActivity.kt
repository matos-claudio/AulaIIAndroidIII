package com.claudio.aulaiikotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.claudio.aulaiikotlin.databinding.ActivityHorizontalBinding

class HorizontalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHorizontalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            horizontalChart.animation.duration = 1000
            horizontalChart.animate(horizontalSet)
//            horizontalChart.show(horizontalSet)
        }

    }

    companion object {
        private val horizontalSet = listOf(
            "Coca-cola" to 4F,
            "Fanta" to 10.3F,
            "Guaraná" to 2.9F
        )
    }
}