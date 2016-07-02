package me.zhl.jsbridge;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Hybrid WebViewClient
 * Created by zhang on 2016/7/2 0002.
 */
public class BridgeWebViewClient extends WebViewClient {

    private UrlHandler mUrlHandler;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri uri = request.getUrl();
        mUrlHandler.handle(uri);
        return super.shouldOverrideUrlLoading(view, request);
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        try {
            Uri uri = Uri.parse(url);
            mUrlHandler.handle(uri);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return super.shouldOverrideUrlLoading(view, url);
    }

}
