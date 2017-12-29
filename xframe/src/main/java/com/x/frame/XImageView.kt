package com.x.frame

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.widget.ImageView

/**
 * Created by xfilshy on 17/11/3.
 */
var ImageView.src : Int
    get() = throwGetException()
    set(value) = setImageResource(value)

var ImageView.bitmap : Bitmap
    get() = throwGetException()
    set(value) = setImageBitmap(value)

var ImageView.drawable : Drawable
    get() = throwGetException()
    set(value) = setImageDrawable(value)