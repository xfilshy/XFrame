package com.x.frame

import android.app.Activity
import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.constraint.ConstraintLayout
import android.support.v4.view.ViewPager
import android.view.SurfaceView
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.webkit.WebView
import android.widget.*

/**
 * Created by xfilshy on 17/9/21.
 */
inline fun <T : View, C1 : (Context) -> T, L : ViewGroup.LayoutParams, C2 : (Int, Int) -> L>
        Activity.view(constructorView: C1, constructorLp: C2, init: (@XDslMarker T).(lp: L) -> Unit): T {
    val view = constructorView(this)
    val lp = constructorLp(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
    view.init(lp)

    return view
}

inline fun Activity.linearLayout(init: (@XDslMarker _LinearLayout).(lp: ViewGroup.MarginLayoutParams) -> Unit): LinearLayout
        = view(::_LinearLayout, ::MarginLayoutParams, init)

inline fun Activity.relativeLayout(init: (@XDslMarker _RelativeLayout).(lp: ViewGroup.MarginLayoutParams) -> Unit): RelativeLayout
        = view(::_RelativeLayout, ::MarginLayoutParams, init)

inline fun Activity.constraintLayout(init: (@XDslMarker _ConstraintLayout).(lp: ViewGroup.MarginLayoutParams) -> Unit): ConstraintLayout
        = view(::_ConstraintLayout, ::MarginLayoutParams, init)

inline fun Activity.textView(init: (@XDslMarker TextView).(lp: ViewGroup.MarginLayoutParams) -> Unit): TextView
        = view(::TextView, ::MarginLayoutParams, init)

inline fun Activity.imageView(init: (@XDslMarker ImageView).(lp: ViewGroup.MarginLayoutParams) -> Unit): ImageView
        = view(::ImageView, ::MarginLayoutParams, init)

inline fun Activity.button(init: (@XDslMarker Button).(lp: ViewGroup.MarginLayoutParams) -> Unit): Button
        = view(::Button, ::MarginLayoutParams, init)

inline fun Activity.toggleButton(init: (@XDslMarker ToggleButton).(lp: ViewGroup.MarginLayoutParams) -> Unit): ToggleButton
        = view(::ToggleButton, ::MarginLayoutParams, init)

inline fun Activity.checkBox(init: (@XDslMarker CheckBox).(lp: ViewGroup.MarginLayoutParams) -> Unit): CheckBox
        = view(::CheckBox, ::MarginLayoutParams, init)

inline fun Activity.radioButton(init: (@XDslMarker RadioButton).(lp: ViewGroup.MarginLayoutParams) -> Unit): RadioButton
        = view(::RadioButton, ::MarginLayoutParams, init)

inline fun Activity.spinner(init: (@XDslMarker Spinner).(lp: ViewGroup.MarginLayoutParams) -> Unit): Spinner
        = view(::Spinner, ::MarginLayoutParams, init)

inline fun Activity.progressBar(init: (@XDslMarker ProgressBar).(lp: ViewGroup.MarginLayoutParams) -> Unit): ProgressBar
        = view(::ProgressBar, ::MarginLayoutParams, init)

inline fun Activity.seekBar(init: (@XDslMarker SeekBar).(lp: ViewGroup.MarginLayoutParams) -> Unit): SeekBar
        = view(::SeekBar, ::MarginLayoutParams, init)

inline fun Activity.quickContactBadge(init: (@XDslMarker QuickContactBadge).(lp: ViewGroup.MarginLayoutParams) -> Unit): QuickContactBadge
        = view(::QuickContactBadge, ::MarginLayoutParams, init)

inline fun Activity.ratingBar(init: (@XDslMarker RatingBar).(lp: ViewGroup.MarginLayoutParams) -> Unit): RatingBar
        = view(::RatingBar, ::MarginLayoutParams, init)

inline fun Activity.switch(init: (@XDslMarker Switch).(lp: ViewGroup.MarginLayoutParams) -> Unit): Switch
        = view(::Switch, ::MarginLayoutParams, init)

inline fun Activity.space(init: (@XDslMarker Space).(lp: ViewGroup.MarginLayoutParams) -> Unit): Space
        = view(::Space, ::MarginLayoutParams, init)

inline fun Activity.editText(init: (@XDslMarker EditText).(lp: ViewGroup.MarginLayoutParams) -> Unit): EditText
        = view(::EditText, ::MarginLayoutParams, init)

inline fun Activity.multiAutoCompleteTextView(init: (@XDslMarker MultiAutoCompleteTextView).(lp: ViewGroup.MarginLayoutParams) -> Unit): MultiAutoCompleteTextView
        = view(::MultiAutoCompleteTextView, ::MarginLayoutParams, init)

inline fun Activity.gridLayout(init: (@XDslMarker _GridLayout).(lp: ViewGroup.MarginLayoutParams) -> Unit): GridLayout
        = view(::_GridLayout, ::MarginLayoutParams, init)

inline fun Activity.frameLayout(init: (@XDslMarker _FrameLayout).(lp: ViewGroup.MarginLayoutParams) -> Unit): FrameLayout
        = view(::_FrameLayout, ::MarginLayoutParams, init)

inline fun Activity.tableRow(init: (@XDslMarker _TableRow).(lp: ViewGroup.MarginLayoutParams) -> Unit): TableRow
        = view(::_TableRow, ::MarginLayoutParams, init)

inline fun Activity.radioGroup(init: (@XDslMarker _RadioGroup).(lp: ViewGroup.MarginLayoutParams) -> Unit): RadioGroup
        = view(::_RadioGroup, ::MarginLayoutParams, init)

inline fun Activity.listView(init: (@XDslMarker ListView).(lp: ViewGroup.MarginLayoutParams) -> Unit): ListView
        = view(::ListView, ::MarginLayoutParams, init)

inline fun Activity.gridView(init: (@XDslMarker GridView).(lp: ViewGroup.MarginLayoutParams) -> Unit): GridView
        = view(::GridView, ::MarginLayoutParams, init)

inline fun Activity.expandableListView(init: (@XDslMarker ExpandableListView).(lp: ViewGroup.MarginLayoutParams) -> Unit): ExpandableListView
        = view(::ExpandableListView, ::MarginLayoutParams, init)

inline fun Activity.scrollView(init: (@XDslMarker _ScrollView).(lp: ViewGroup.MarginLayoutParams) -> Unit): ScrollView
        = view(::_ScrollView, ::MarginLayoutParams, init)

inline fun Activity.horizontalScrollView(init: (@XDslMarker _HorizontalScrollView).(lp: ViewGroup.MarginLayoutParams) -> Unit): HorizontalScrollView
        = view(::_HorizontalScrollView, ::MarginLayoutParams, init)

inline fun Activity.tabHost(init: (@XDslMarker _TabHost).(lp: ViewGroup.MarginLayoutParams) -> Unit): TabHost
        = view(::_TabHost, ::MarginLayoutParams, init)

inline fun Activity.webView(init: (@XDslMarker WebView).(lp: ViewGroup.MarginLayoutParams) -> Unit): WebView
        = view(::WebView, ::MarginLayoutParams, init)

inline fun Activity.searchView(init: (@XDslMarker SearchView).(lp: ViewGroup.MarginLayoutParams) -> Unit): SearchView
        = view(::SearchView, ::MarginLayoutParams, init)

inline fun Activity.viewPager(init: (@XDslMarker ViewPager).(lp: ViewGroup.MarginLayoutParams) -> Unit): ViewPager
        = view(::ViewPager, ::MarginLayoutParams, init)

inline fun Activity.imageButton(init: (@XDslMarker ImageButton).(lp: ViewGroup.MarginLayoutParams) -> Unit): ImageButton
        = view(::ImageButton, ::MarginLayoutParams, init)

inline fun Activity.videoView(init: (@XDslMarker VideoView).(lp: ViewGroup.MarginLayoutParams) -> Unit): VideoView
        = view(::VideoView, ::MarginLayoutParams, init)

inline fun Activity.timePicker(init: (@XDslMarker TimePicker).(lp: ViewGroup.MarginLayoutParams) -> Unit): TimePicker
        = view(::TimePicker, ::MarginLayoutParams, init)

inline fun Activity.datePicker(init: (@XDslMarker DatePicker).(lp: ViewGroup.MarginLayoutParams) -> Unit): DatePicker
        = view(::DatePicker, ::MarginLayoutParams, init)

inline fun Activity.calendarView(init: (@XDslMarker CalendarView).(lp: ViewGroup.MarginLayoutParams) -> Unit): CalendarView
        = view(::CalendarView, ::MarginLayoutParams, init)

inline fun Activity.chronometer(init: (@XDslMarker Chronometer).(lp: ViewGroup.MarginLayoutParams) -> Unit): Chronometer
        = view(::Chronometer, ::MarginLayoutParams, init)

@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
inline fun Activity.textClock(init: (@XDslMarker TextClock).(lp: ViewGroup.MarginLayoutParams) -> Unit): TextClock
        = view(::TextClock, ::MarginLayoutParams, init)

inline fun Activity.imageSwitcher(init: (@XDslMarker ImageSwitcher).(lp: ViewGroup.MarginLayoutParams) -> Unit): ImageSwitcher
        = view(::ImageSwitcher, ::MarginLayoutParams, init)

inline fun Activity.adapterViewFlipper(init: (@XDslMarker AdapterViewFlipper).(lp: ViewGroup.MarginLayoutParams) -> Unit): AdapterViewFlipper
        = view(::AdapterViewFlipper, ::MarginLayoutParams, init)

inline fun Activity.stackView(init: (@XDslMarker StackView).(lp: ViewGroup.MarginLayoutParams) -> Unit): StackView
        = view(::StackView, ::MarginLayoutParams, init)

inline fun Activity.textSwitcher(init: (@XDslMarker TextSwitcher).(lp: ViewGroup.MarginLayoutParams) -> Unit): TextSwitcher
        = view(::TextSwitcher, ::MarginLayoutParams, init)

inline fun Activity.viewAnimator(init: (@XDslMarker ViewAnimator).(lp: ViewGroup.MarginLayoutParams) -> Unit): ViewAnimator
        = view(::ViewAnimator, ::MarginLayoutParams, init)

inline fun Activity.viewFlipper(init: (@XDslMarker ViewFlipper).(lp: ViewGroup.MarginLayoutParams) -> Unit): ViewFlipper
        = view(::ViewFlipper, ::MarginLayoutParams, init)

inline fun Activity.viewSwitcher(init: (@XDslMarker ViewSwitcher).(lp: ViewGroup.MarginLayoutParams) -> Unit): ViewSwitcher
        = view(::ViewSwitcher, ::MarginLayoutParams, init)

inline fun Activity.textureView(init: (@XDslMarker TextureView).(lp: ViewGroup.MarginLayoutParams) -> Unit): TextureView
        = view(::TextureView, ::MarginLayoutParams, init)

inline fun Activity.surfaceView(init: (@XDslMarker SurfaceView).(lp: ViewGroup.MarginLayoutParams) -> Unit): SurfaceView
        = view(::SurfaceView, ::MarginLayoutParams, init)

inline fun Activity.numberPicker(init: (@XDslMarker NumberPicker).(lp: ViewGroup.MarginLayoutParams) -> Unit): NumberPicker
        = view(::NumberPicker, ::MarginLayoutParams, init)

inline fun Activity.toolbar(init: (@XDslMarker _Toolbar).(lp: ViewGroup.MarginLayoutParams) -> Unit): Toolbar
        = view(::_Toolbar, ::MarginLayoutParams, init)