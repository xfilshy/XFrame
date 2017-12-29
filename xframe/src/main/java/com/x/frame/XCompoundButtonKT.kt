package com.x.frame

import android.widget.CompoundButton

/**
 * Created by xfilshy on 17/11/6.
 */
var CompoundButton.onCheck: (CompoundButton, Boolean) -> Unit
    get() = throwGetException()
    set(value) = setOnCheckedChangeListener(value)