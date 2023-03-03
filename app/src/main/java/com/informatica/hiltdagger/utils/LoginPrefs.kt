package com.informatica.hiltdagger.utils

import android.content.Context

object LoginPrefs {
    fun setUserId(context: Context, id: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.ID, id).apply()
    }

    fun getUserId(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.ID, "")
    }

    fun setFullName(context: Context, fullname: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.FULL_NAME, fullname).apply()
    }

    fun getFullName(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.FULL_NAME, "")
    }

    fun setEmail(context: Context, email: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.EMAIL, email).apply()
    }

    fun getEmail(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.EMAIL, "")
    }


    fun setPhone(context: Context, value: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.PHONE, value).apply()
    }

    fun getPhone(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.PHONE, "")
    }

    fun setUserName(context: Context, value: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.USERNAME, value).apply()
    }

    fun getUserName(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.USERNAME, "")
    }
    fun setCity(context: Context, value: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.CITY, value).apply()
    }

    fun getCity(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.CITY, "")
    }
    fun setAddress(context: Context, value: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.ADDRESS, value).apply()
    }

    fun getAddress(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.ADDRESS, "")
    }
    fun setUserImage(context: Context, value: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.PHOTO, value).apply()
    }
    fun getUserImage(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.PHOTO, "")
    }

    fun setToken(context: Context, value: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.TOKEN, value).apply()
    }
    fun getToken(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.TOKEN, "")
    }

    fun setUserType(context: Context, value: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.TYPE, value).apply()
    }
    fun getUserType(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.TYPE, "")
    }

    fun setUserLat(context: Context, value: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.LAT, value).apply()
    }
    fun getUserLat(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.LAT, "")
    }

    fun setUserLong(context: Context, value: String) {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(AppConstants.LONG, value).apply()
    }
    fun getUserLong(context: Context): String? {
        val pref = context.getSharedPreferences(MardudPreference.mardudConstatnt.PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(AppConstants.LONG, "")
    }
}