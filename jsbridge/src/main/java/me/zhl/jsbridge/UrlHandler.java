package me.zhl.jsbridge;

import android.net.Uri;

/**
 * Created by zhang on 2016/7/2 0002.
 */
public class UrlHandler {
    public void handle(Uri uri) {
        uri.getScheme();
        uri.getHost();
        uri.getPathSegments();
        uri.getQueryParameterNames();
    }
}
