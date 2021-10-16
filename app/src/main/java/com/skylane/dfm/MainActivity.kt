package com.skylane.dfm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.skylane.dfm.databinding.ActivityMainBinding
import com.skylane.dfm.router.openAboutActivity

class MainActivity : AppCompatActivity() {
    private var doubleBackToExitPressedOnce = false
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        onClickListener()
    }


    private fun onClickListener() {
        binding.goSig.setOnClickListener {
            startActivity(Intent(this, SigActivity::class.java))
        }

        binding.goAboutUs.setOnClickListener {
            //Modular
            openAboutActivity(this)
        }

        binding.goSejarah.setOnClickListener {
//            startActivity(Intent(this, AboutTsunamiActivity::class.java))
        }

        binding.goCovidInfo.setOnClickListener {
            // startActivity(Intent(this, ))
            Toast.makeText(this, "Coming Soon Fitur !", Toast.LENGTH_LONG).show()
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }
        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }
}