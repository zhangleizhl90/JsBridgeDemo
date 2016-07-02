package me.zhl.jsbridge;

import android.webkit.WebView;

/**
 * Java Call Js
 * Created by zhang on 2016/7/2 0002.
 */
public class JavaCallJs {
    private WebView mWebView;

    private static final String TEMPLATE = "javascript:%s";

    public void callJs(final String script) {
        if (null == mWebView) {
            return;
        }

        try {
            mWebView.post(new Runnable() {
                @Override
                public void run() {
                    mWebView.loadUrl(String.format(TEMPLATE, script));
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
