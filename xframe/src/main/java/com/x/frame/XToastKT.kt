@file:JvmName("ToastKT")

package com.x.frame

import android.app.Fragment
import android.content.Context
import android.widget.Toast

/**
 * Created by xfilshy on 17/9/18.
 */
inline fun Context.toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

inline fun Context.toast(msg: Int) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

inline fun Context.toastLong(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

inline fun Context.toastLong(msg: Int) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

inline fun Fragment.toast(msg: String) = Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()

inline fun Fragment.toast(msg: Int) = Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()

inline fun Fragment.toastLong(msg: String) = Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()

inline fun Fragment.toastLong(msg: Int) = Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()

inline fun android.support.v4.app.Fragment.toast(msg: String) = Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()

inline fun android.support.v4.app.Fragment.toast(msg: Int) = Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()

inline fun android.support.v4.app.Fragment.toastLong(msg: String) = Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()

inline fun android.support.v4.app.Fragment.toastLong(msg: Int) = Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()