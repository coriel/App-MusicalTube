package com.mureka.musicaltube;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coriel on 2016. 2. 4..
 */
public class ShowWebView extends Activity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getWindow().requestFeature(Window.FEATURE_PROGRESS);


        setContentView(R.layout.webview);


        webView = (android.webkit.WebView)findViewById(R.id.webView);
        String url = "http://pcom.iptime.org:90/MusicalTube/";




        webView.getSettings().setJavaScriptEnabled(true);

        final Activity activity = this;
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                activity.setProgress(progress * 100);
            }
        });
        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String fallingUrl) {
                Toast.makeText(activity, "로딩오류" + description, Toast.LENGTH_SHORT).show();
            }
        });

        webView.setWebViewClient(new WebViewClient()); // 이걸 안해주면 새창이 뜸
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
//        webView.getSettings().setPluginsEnabled(true);
//        webView.getSettings().setSupportMultipleWindows(true);
//        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
//        webView.setBackgroundColor(0x00000000);
//        webView.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
//        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);

//        webView.setBackgroundColor(Color.GRAY);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);

        webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        webView.loadUrl(url);

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
