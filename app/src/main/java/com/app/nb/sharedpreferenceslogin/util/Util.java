package com.app.nb.sharedpreferenceslogin.util;

import android.content.SharedPreferences;

public class Util {

    public static String getEmailSessionPreference(SharedPreferences preferences) {
        return preferences.getString("email", "");
    }

    public static String getPasswordSessionPreference(SharedPreferences preferences) {
        return preferences.getString("password", "");
    }
}
