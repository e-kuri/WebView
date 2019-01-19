package com.honeywell.hts.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.webViewClient = object: WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?) = false

            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?) = false
        }
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        webview.settings.setSupportMultipleWindows(true)
        webview.settings.javaScriptCanOpenWindowsAutomatically = true
        webview.settings.allowContentAccess = true
        webview.settings.domStorageEnabled = true
        myWebView.loadUrl("https://dev.caidc.honeywell.com/admin/device_registration?hide-header=true")
    }

}
