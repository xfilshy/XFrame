package com.x.frame

import android.content.res.ColorStateList
import android.os.Build
import android.support.annotation.RequiresApi
import android.widget.TextView

/**
 * Created by xfilshy on 17/10/13.
 */
var TextView.textColor: Number
    get() = throwGetException()
    set(value) {
        if (value is Int) {
            if (resources.getResourceName(value) === null) {
                setTextColor(value)
            } else {
                try {
                    setTextColor(resources.getColor(value))
                } catch (e: Exception) {
                    setTextColor(ColorStateList.createFromXml(resources, resources.getXml(value)))
                }
            }
        } else {
            setTextColor(value.toInt())
        }
    }

var TextView.hintTextColor: Number
    get() = throwGetException()
    set(value) {
        if (value is Int) {
            if (resources.getResourceName(value) === null) {
                setHintTextColor(value)
            } else {
                try {
                    setHintTextColor(resources.getColor(value))
                } catch (e: Exception) {
                    setHintTextColor(ColorStateList.createFromXml(resources, resources.getXml(value)))
                }
            }
        } else {
            setHintTextColor(value.toInt())
        }
    }

var TextView.linkTextColor: Number
    get() = throwGetException()
    set(value) {
        if (value is Int) {
            if (resources.getResourceName(value) === null) {
                setLinkTextColor(value)
            } else {
                try {
                    setLinkTextColor(resources.getColor(value))
                } catch (e: Exception) {
                    setLinkTextColor(ColorStateList.createFromXml(resources, resources.getXml(value)))
                }
            }
        } else {
            setLinkTextColor(value.toInt())
        }
    }


var TextView.lines: Int
    get() = throwGetException()
    set(value) = setLines(value)

var TextView.spacingExtra: Float
    get() = throwGetException()
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    set(value) {
        setLineSpacing(value, lineSpacingMultiplier)
    }

var TextView.spacingMultiplier: Float
    get() = throwGetException()
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    set(value) {
        setLineSpacing(lineSpacingExtra, value)
    }

var TextView.autoLink: Int
    get() = throwGetException()
    set(value) {
        autoLinkMask = value
    }


