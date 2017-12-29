package com.x.frame

/**
 * Created by xfilshy on 17/10/13.
 */
class XGetException : Exception("get() can not call")

inline fun throwGetException(): Nothing = throw XGetException()