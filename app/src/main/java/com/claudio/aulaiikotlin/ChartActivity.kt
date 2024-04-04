package com.claudio.aulaiikotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.claudio.aulaiikotlin.databinding.ActivityChartBinding

class ChartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btLineChart.setOnClickListener {
            val intent = Intent(this, LineActivity::class.java)
            startActivity(intent)
        }

        binding.btVerticalChart.setOnClickListener {
            val intent = Intent(this, BarActivity::class.java)
            startActivity(intent)
        }

        binding.btHorizontalChart.setOnClickListener {
            val intent = Intent(this, HorizontalActivity::class.java)
            startActivity(intent)
        }
    }
}