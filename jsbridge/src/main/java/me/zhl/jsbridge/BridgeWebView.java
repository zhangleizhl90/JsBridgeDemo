package me.zhl.jsbridge;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * Hybrid WebView
 * Created by zhang on 2016/7/2 0002.
 */
public class BridgeWebView extends WebView {
    public BridgeWebView(Context context) {
        super(context);
    }

    public BridgeWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BridgeWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
