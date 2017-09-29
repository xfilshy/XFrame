@file:JvmName("LogKT")

package com.x.frame

import android.util.Log

var XTAG: String = "LogKT"

inline fun Any?.logWarn(message: Any?, thr: Throwable? = null) = log(message, thr, Log.WARN)

inline fun logWarn(message: Any?, thr: Throwable? = null) = log(message, thr, Log.WARN)

inline fun Any?.logVerbose(message: Any?, thr: Throwable? = null) = log(message, thr, Log.VERBOSE)

inline fun logVerbose(message: Any?, thr: Throwable? = null) = log(message, thr, Log.VERBOSE)

inline fun Any?.logInfo(message: Any?, thr: Throwable? = null) = log(message, thr, Log.INFO)

inline fun logInfo(message: Any?, thr: Throwable? = null) = log(message, thr, Log.INFO)

inline fun Any?.logDebug(message: Any?, thr: Throwable? = null) = log(message, thr, Log.DEBUG)

inline fun logDebug(message: Any?, thr: Throwable? = null) = log(message, thr, Log.DEBUG)

inline fun Any?.logAssert(message: Any?, thr: Throwable? = null) = log(message, thr, Log.ASSERT)

inline fun logAssert(message: Any?, thr: Throwable? = null) = log(message, thr, Log.ASSERT)

inline fun Any?.logError(message: Any?, thr: Throwable? = null) = log(message, thr, Log.ERROR)

inline fun logError(message: Any?, thr: Throwable? = null) = log(message, thr, Log.ERROR)

inline fun Any?.log(
        message: Any?,
        thr: Throwable?,
        level: Int) {
    log(this as? String ?: this?.let { this::class.simpleName } ?: XTAG,
            message, thr, level,
            { tag, msg -> Log.e(tag, msg) },
            { tag, msg, thr -> Log.e(tag, msg, thr) })
}

inline fun log(
        message: Any?,
        thr: Throwable?,
        level: Int) {
    log(XTAG, message, thr, level,
            { tag, msg -> Log.e(tag, msg) },
            { tag, msg, thr -> Log.e(tag, msg, thr) })
}

inline fun log(
        tag: String,
        message: Any?,
        thr: Throwable?,
        level: Int,
        f: (String, String) -> Unit,
        fThrowable: (String, String, Throwable) -> Unit) {
    if (Log.isLoggable(tag, level)) {
        if (thr != null) {
            fThrowable(tag, message?.toString() ?: "null", thr)
        } else {
            f(tag, message?.toString() ?: "null")
        }
    }
}