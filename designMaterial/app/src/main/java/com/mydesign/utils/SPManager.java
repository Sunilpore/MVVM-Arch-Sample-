package com.mydesign.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.mydesign.BaseApp;

public class SPManager {
    private static SPManager myManager;
    private static SharedPreferences sharedPreferences;
    private String HEADER = "header";
    private String IS_STORE_MANAGER = "is_store_manager";
    private String USER_NAME = "user_name";
    private String LOGIN_ID = "login_id";
    private String MOBILE_NO = "mobile_no";
    private String LOGGED_IN = "logged_in";
    private String ACCESS_TOKEN = "access_token";

    private SPManager(Context context) {
        if (sharedPreferences == null)
            sharedPreferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
    }

    public static SPManager getInstance() {
        return myManager != null ? myManager : new SPManager(BaseApp.getContext());
    }

    private void saveString(String key, String data) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, data);
        editor.apply();
    }

    private void saveInt(String key, int data) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, data);
        editor.apply();
    }

    private void saveBoolean(String key, boolean data) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, data);
        editor.apply();
    }

    private void delete(String key) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //editor.putString(key, "null");
        editor.remove(key);
        //editor.clear();
        editor.apply();
    }

    private String retrieveString(String key) {
        return sharedPreferences.getString(key, "");
    }

    private int retrieveInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    private boolean retrieveBool(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    private boolean retrieveBool(String key, boolean defaultValue) {
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    public synchronized final void saveObject(String key, Object model) {
        sharedPreferences.edit().putString(key, new Gson().toJson(model)).apply();
    }

    public synchronized final Object retrieveObject(String key, Class<?> modelClass) {
        return new Gson().fromJson(sharedPreferences.getString(key, null), modelClass);
    }

    public String getLoginId() {
        return retrieveString(LOGIN_ID);
    }

    public void setLoginId(String loginId) {
        saveString(LOGIN_ID, loginId);
    }
}