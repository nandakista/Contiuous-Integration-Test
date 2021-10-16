package com.skylane.dfm.router

import android.content.Context
import android.content.Intent
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import java.lang.Exception

const val BASE_PACKAGE = "com.skylane"

const val ABOUT_MODULE = "$BASE_PACKAGE.about"

fun openAboutActivity(context: Context){
    try {
        val intent = Intent(context, Class.forName("$ABOUT_MODULE.AboutActivity"))
        context.startActivity(intent)
    } catch (e: Exception) {
        Toast.makeText(context, "Fitur tidak ditemukan", LENGTH_LONG).show()
    }
}