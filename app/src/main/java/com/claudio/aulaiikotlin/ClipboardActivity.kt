package com.claudio.aulaiikotlin

import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.claudio.aulaiikotlin.databinding.ActivityClipboardBinding

class ClipboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityClipboardBinding
    private lateinit var clipboardManager: ClipboardManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClipboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

        binding.edtResult.postDelayed({
            val clipboardText = getTextFromClipboard()
            binding.edtResult.setText(clipboardText)
        }, 100)

        binding.btPaste.setOnClickListener {
            val clipboardText = getTextFromClipboard()
            binding.edtResult.setText(clipboardText)
        }
    }

    private fun getTextFromClipboard(): CharSequence? {
        return clipboardManager.primaryClip?.getItemAt(0)?.text
    }
}