package com.skylane.dfm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat
import com.skylane.dfm.common.AppConstants
import com.skylane.dfm.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.statusBarColor = ContextCompat.getColor(this, R.color.design_default_color_primary)
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
//            finish()
        }, AppConstants.SPLASH_TIME_MILLISECOND)
    }
}