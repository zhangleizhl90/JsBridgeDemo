package me.zhl.jsbridge.jscalljava;

import android.webkit.JavascriptInterface;

import me.zhl.jsbridge.jscalljava.entry.Parameter;

/**
 *
 * Created by zhang on 2016/7/2 0002.
 */
@SuppressWarnings("unused")
public class JsCallJava {

    /**
     *
     * @param message parameters: {}, successCallbackId: "", errorCallbackId: ""
     */
    @JavascriptInterface
    public void sendMessage(String message) {
        Parameter parameter = new Parameter(message);


    }
}
