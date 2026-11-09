package com.pizzaria.entregas

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.webkit.WebView

class MainActivity : Activity() {
    private lateinit var web: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.parseColor("#0B0F0D")
        window.navigationBarColor = Color.parseColor("#121715")
        web = WebView(this)
        web.setBackgroundColor(Color.parseColor("#0B0F0D"))
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        setContentView(web)
        web.loadUrl("file:///android_asset/www/index.html")
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (web.canGoBack()) web.goBack() else super.onBackPressed()
    }
}