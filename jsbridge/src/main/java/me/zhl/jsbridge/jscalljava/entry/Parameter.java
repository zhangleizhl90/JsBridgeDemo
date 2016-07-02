package me.zhl.jsbridge.jscalljava.entry;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * JS Call Java Parameter
 * Created by zhang on 2016/7/2 0002.
 */
@SuppressWarnings("unused")
public class Parameter {
    private static final String KEY_SUCCESS_CALLBACK_ID = "successCallbackId";
    private static final String KEY_ERROR_CALLBACK_ID   = "errorCallbackId";
    private static final String KEY_PARAMETERS          = "parameters";

    private String mSuccessCallbackId;
    private String mErrorCallbackId;
    private JSONObject mParameters;

    public Parameter(String message) {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(message);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if (null == jsonObject) {
            return;
        }

        mSuccessCallbackId = jsonObject.optString(KEY_SUCCESS_CALLBACK_ID);
        mErrorCallbackId = jsonObject.optString(KEY_ERROR_CALLBACK_ID);
        mParameters = jsonObject.optJSONObject(KEY_PARAMETERS);

    }

    public String getSuccessCallbackId() {
        return mSuccessCallbackId;
    }

    public String getErrorCallbackId() {
        return mErrorCallbackId;
    }

    // ====================================================================

    public String getString(String key) {
        if (null == mParameters || TextUtils.isEmpty(key)) {
            return null;
        }

        return mParameters.optString(key);
    }

    public Integer getInt(String key) {
        if (null == mParameters || TextUtils.isEmpty(key)) {
            return null;
        }

        return mParameters.optInt(key);
    }

    public Double getFloat(String key) {
        if (null == mParameters || TextUtils.isEmpty(key)) {
            return null;
        }

        return mParameters.optDouble(key);
    }

    public Boolean getBoolean(String key) {
        if (null == mParameters || TextUtils.isEmpty(key)) {
            return null;
        }

        return mParameters.optBoolean(key);
    }

    public JSONObject getJSONObject(String key) {
        if (null == mParameters || TextUtils.isEmpty(key)) {
            return null;
        }

        return mParameters.optJSONObject(key);
    }

    public JSONArray getJSONArray(String key) {
        if (null == mParameters || TextUtils.isEmpty(key)) {
            return null;
        }

        return mParameters.optJSONArray(key);
    }
}
