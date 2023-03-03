package com.informatica.hiltdagger.utils

import android.content.Context
import com.informatica.hiltdagger.utils.MardudPreference.mardudConstatnt.FROM_CART
import com.informatica.hiltdagger.utils.MardudPreference.mardudConstatnt.IS_LOGIN
import com.informatica.hiltdagger.utils.MardudPreference.mardudConstatnt.PREFERENCES
import com.informatica.hiltdagger.utils.MardudPreference.mardudConstatnt.USER_LAT
import com.informatica.hiltdagger.utils.MardudPreference.mardudConstatnt.USER_LONG
import com.informatica.hiltdagger.utils.MardudPreference.mardudConstatnt.is_bussiness_account

object MardudPreference {

    fun setIsBusinessAccount(context: Context, value: Boolean) {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putBoolean(is_bussiness_account, value).apply()
    }

    fun getIsBusinessAccount(context: Context): Boolean {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        return pref.getBoolean(is_bussiness_account, false)
    }

    fun setIsLogin(context: Context, value: Boolean) {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putBoolean(IS_LOGIN, value).apply()
    }

    fun getIsLogin(context: Context): Boolean {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        return pref.getBoolean(IS_LOGIN, false)
    }

    fun setIsComingFromCart(context: Context, value: Boolean) {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putBoolean(FROM_CART, value).apply()
    }

    fun getIsComingFromCart(context: Context): Boolean {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        return pref.getBoolean(FROM_CART, false)
    }

    fun setUserCurrentLat(context: Context, value: String) {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(USER_LAT, value).apply()
    }

    fun getUserCurrentLat(context: Context): String {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(USER_LAT, "").toString()
    }

    fun setUserCurrentLong(context: Context, value: String) {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(USER_LONG, value).apply()
    }

    fun getUserCurrentLong(context: Context): String {
        val pref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
        return pref.getString(USER_LONG, "").toString()
    }


    object mardudConstatnt {
        var is_bussiness_account = "is_bussiness_account"
        val PREFERENCES = "pref"
        val IS_LOGIN = "is_login"
        val FROM_CART = "from_cart"
        val USER_LAT = "user_lat"
        val USER_LONG = "user_long"
    }
}