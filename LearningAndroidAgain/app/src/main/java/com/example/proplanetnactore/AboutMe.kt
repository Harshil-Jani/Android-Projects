package com.example.proplanetnactore

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class AboutMe : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        val webviewScreen = findViewById<WebView>(R.id.site);
        webViewCtx(webviewScreen)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewCtx(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://theharshiljani.tech/")
        }
    }
}