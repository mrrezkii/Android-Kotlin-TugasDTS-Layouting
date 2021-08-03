package com.mrrezki.tugas

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.mrrezki.tugas.Layout.ConstraintActivity
import com.mrrezki.tugas.Layout.LinearActivity
import com.mrrezki.tugas.Layout.RelativeActivity
import com.mrrezki.tugas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setupView()
    }

    private fun setupView() {
        binding.btnConstraint.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstraintActivity::class.java))
        }
        binding.btnLinear.setOnClickListener {
            startActivity(Intent(this@MainActivity, LinearActivity::class.java))
        }
        binding.btnRelative.setOnClickListener {
            startActivity(Intent(this@MainActivity, RelativeActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        val w: Window = window
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
    }
}