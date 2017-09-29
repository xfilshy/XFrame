@file:JvmName("XUIKT")

package com.x.frame

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.view.ViewGroup
import android.widget.*

/**
 * Created by xfilshy on 17/9/26.
 */
class _LinearLayout private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> LinearLayout.LayoutParams)
    : LinearLayout(context), _ViewInterfaceKT<LinearLayout, LinearLayout.LayoutParams, (ViewGroup.MarginLayoutParams) -> LinearLayout.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, LinearLayout::LayoutParams)
}

class _RelativeLayout private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> RelativeLayout.LayoutParams)
    : RelativeLayout(context), _ViewInterfaceKT<RelativeLayout, RelativeLayout.LayoutParams, (ViewGroup.MarginLayoutParams) -> RelativeLayout.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, RelativeLayout::LayoutParams)
}

class _TableLayout private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> TableLayout.LayoutParams)
    : TableLayout(context), _ViewInterfaceKT<TableLayout, TableLayout.LayoutParams, (ViewGroup.MarginLayoutParams) -> TableLayout.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, TableLayout::LayoutParams)
}

class _ConstraintLayout private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> ConstraintLayout.LayoutParams)
    : ConstraintLayout(context), _ViewInterfaceKT<ConstraintLayout, ConstraintLayout.LayoutParams, (ViewGroup.MarginLayoutParams) -> ConstraintLayout.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, ConstraintLayout::LayoutParams)
}

class _GridLayout private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> GridLayout.LayoutParams)
    : GridLayout(context), _ViewInterfaceKT<GridLayout, GridLayout.LayoutParams, (ViewGroup.MarginLayoutParams) -> GridLayout.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, GridLayout::LayoutParams)
}

class _FrameLayout private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> FrameLayout.LayoutParams)
    : FrameLayout(context), _ViewInterfaceKT<FrameLayout, FrameLayout.LayoutParams, (ViewGroup.MarginLayoutParams) -> FrameLayout.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, FrameLayout::LayoutParams)
}

class _TableRow private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> TableRow.LayoutParams)
    : TableRow(context), _ViewInterfaceKT<TableRow, TableRow.LayoutParams, (ViewGroup.MarginLayoutParams) -> TableRow.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, TableRow::LayoutParams)
}

class _RadioGroup private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> RadioGroup.LayoutParams)
    : RadioGroup(context), _ViewInterfaceKT<TableRow, RadioGroup.LayoutParams, (ViewGroup.MarginLayoutParams) -> RadioGroup.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, RadioGroup::LayoutParams)
}

class _ScrollView private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> FrameLayout.LayoutParams)
    : ScrollView(context), _ViewInterfaceKT<TableRow, FrameLayout.LayoutParams, (ViewGroup.MarginLayoutParams) -> FrameLayout.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, FrameLayout::LayoutParams)
}

class _HorizontalScrollView private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> FrameLayout.LayoutParams)
    : HorizontalScrollView(context), _ViewInterfaceKT<TableRow, FrameLayout.LayoutParams, (ViewGroup.MarginLayoutParams) -> FrameLayout.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, FrameLayout::LayoutParams)
}

class _TabHost private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> FrameLayout.LayoutParams)
    : TabHost(context), _ViewInterfaceKT<TableRow, FrameLayout.LayoutParams, (ViewGroup.MarginLayoutParams) -> FrameLayout.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, FrameLayout::LayoutParams)
}

class _Toolbar private constructor(context: Context, override val lpc: (ViewGroup.MarginLayoutParams) -> Toolbar.LayoutParams)
    : Toolbar(context), _ViewInterfaceKT<TableRow, Toolbar.LayoutParams, (ViewGroup.MarginLayoutParams) -> Toolbar.LayoutParams> by _ViewImplKT(lpc) {

    constructor(context: Context) : this(context, Toolbar::LayoutParams)
}