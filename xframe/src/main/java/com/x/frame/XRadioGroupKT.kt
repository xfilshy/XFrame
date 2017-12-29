package com.x.frame

import android.widget.RadioGroup

/**
 * Created by xfilshy on 17/11/6.
 */
var RadioGroup.onCheck: (RadioGroup, Int) -> Unit
    get() = throwGetException()
    set(value) = setOnCheckedChangeListener(value)