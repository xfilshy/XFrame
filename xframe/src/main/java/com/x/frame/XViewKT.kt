@file:JvmName("XViewKT")

package com.x.frame

import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.constraint.ConstraintLayout
import android.support.constraint.Guideline
import android.support.v4.view.ViewPager
import android.view.SurfaceView
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.*

/**
 * Created by xfilshy on 17/9/26.
 */

interface _ViewInterfaceKT<in V : ViewGroup, out LP : ViewGroup.LayoutParams, out LPC : (ViewGroup.MarginLayoutParams) -> LP> {

    val lpc: LPC

    fun <CV : View> V.view(c: (Context) -> CV, init: CV.(LP) -> Unit): CV

    fun V.textView(init: (@XDslMarker TextView).(LP) -> Unit): TextView

    fun V.imageView(init: (@XDslMarker ImageView).(LP) -> Unit): ImageView

    fun V.guideline(init: (@XDslMarker Guideline).(LP) -> Unit): Guideline

    fun V.linearLayout(init: (@XDslMarker _LinearLayout).(LP) -> Unit): LinearLayout

    fun V.relativeLayout(init: (@XDslMarker _RelativeLayout).(LP) -> Unit): RelativeLayout

    fun V.constraintLayout(init: (@XDslMarker _ConstraintLayout).(LP) -> Unit): ConstraintLayout

    fun V.button(init: (@XDslMarker Button).(LP) -> Unit): Button

    fun V.toggleButton(init: (@XDslMarker ToggleButton).(LP) -> Unit): ToggleButton

    fun V.checkBox(init: (@XDslMarker CheckBox).(LP) -> Unit): CheckBox

    fun V.radioButton(init: (@XDslMarker RadioButton).(LP) -> Unit): RadioButton

    fun V.spinner(init: (@XDslMarker Spinner).(LP) -> Unit): Spinner

    fun V.progressBar(init: (@XDslMarker ProgressBar).(LP) -> Unit): ProgressBar

    fun V.seekBar(init: (@XDslMarker SeekBar).(LP) -> Unit): SeekBar

    fun V.quickContactBadge(init: (@XDslMarker QuickContactBadge).(LP) -> Unit): QuickContactBadge

    fun V.ratingBar(init: (@XDslMarker RatingBar).(LP) -> Unit): RatingBar

    fun V.switch(init: (@XDslMarker Switch).(LP) -> Unit): Switch

    fun V.space(init: (@XDslMarker Space).(LP) -> Unit): Space

    fun V.editText(init: (@XDslMarker EditText).(LP) -> Unit): EditText

    fun V.multiAutoCompleteTextView(init: (@XDslMarker MultiAutoCompleteTextView).(LP) -> Unit): MultiAutoCompleteTextView

    fun V.gridLayout(init: (@XDslMarker GridLayout).(LP) -> Unit): GridLayout

    fun V.frameLayout(init: (@XDslMarker FrameLayout).(LP) -> Unit): FrameLayout

    fun V.tableRow(init: (@XDslMarker TableRow).(LP) -> Unit): TableRow

    fun V.radioGroup(init: (@XDslMarker RadioGroup).(LP) -> Unit): RadioGroup

    fun V.listView(init: (@XDslMarker ListView).(LP) -> Unit): ListView

    fun V.gridView(init: (@XDslMarker GridView).(LP) -> Unit): GridView

    fun V.expandableListView(init: (@XDslMarker ExpandableListView).(LP) -> Unit): ExpandableListView

    fun V.scrollView(init: (@XDslMarker ScrollView).(LP) -> Unit): ScrollView

    fun V.horizontalScrollView(init: (@XDslMarker HorizontalScrollView).(LP) -> Unit): HorizontalScrollView

    fun V.tabHost(init: (@XDslMarker TabHost).(LP) -> Unit): TabHost

    fun V.webView(init: (@XDslMarker WebView).(LP) -> Unit): WebView

    fun V.searchView(init: (@XDslMarker SearchView).(LP) -> Unit): SearchView

    fun V.viewPager(init: (@XDslMarker ViewPager).(LP) -> Unit): ViewPager

    fun V.imageButton(init: (@XDslMarker ImageButton).(LP) -> Unit): ImageButton

    fun V.videoView(init: (@XDslMarker VideoView).(LP) -> Unit): VideoView

    fun V.timePicker(init: (@XDslMarker TimePicker).(LP) -> Unit): TimePicker

    fun V.datePicker(init: (@XDslMarker DatePicker).(LP) -> Unit): DatePicker

    fun V.calendarView(init: (@XDslMarker CalendarView).(LP) -> Unit): CalendarView

    fun V.chronometer(init: (@XDslMarker Chronometer).(LP) -> Unit): Chronometer

    fun V.textClock(init: (@XDslMarker TextClock).(LP) -> Unit): TextClock

    fun V.imageSwitcher(init: (@XDslMarker ImageSwitcher).(LP) -> Unit): ImageSwitcher

    fun V.adapterViewFlipper(init: (@XDslMarker AdapterViewFlipper).(LP) -> Unit): AdapterViewFlipper

    fun V.stackView(init: (@XDslMarker StackView).(LP) -> Unit): StackView

    fun V.textSwitcher(init: (@XDslMarker TextSwitcher).(LP) -> Unit): TextSwitcher

    fun V.viewAnimator(init: (@XDslMarker ViewAnimator).(LP) -> Unit): ViewAnimator

    fun V.viewFlipper(init: (@XDslMarker ViewFlipper).(LP) -> Unit): ViewFlipper

    fun V.viewSwitcher(init: (@XDslMarker ViewSwitcher).(LP) -> Unit): ViewSwitcher

    fun V.textureView(init: (@XDslMarker TextureView).(LP) -> Unit): TextureView

    fun V.surfaceView(init: (@XDslMarker SurfaceView).(LP) -> Unit): SurfaceView

    fun V.numberPicker(init: (@XDslMarker NumberPicker).(LP) -> Unit): NumberPicker

    fun V.toolbar(init: (@XDslMarker Toolbar).(LP) -> Unit): Toolbar
}


class _ViewImplKT<in V : ViewGroup, out LP : ViewGroup.LayoutParams, out LPC : (ViewGroup.MarginLayoutParams) -> LP>(lpc: LPC) : _ViewInterfaceKT<V, LP, LPC> {

    override val lpc: LPC = lpc

    override inline fun <CV : View> V.view(c: (Context) -> CV, init: CV.(LP) -> Unit): CV {
        val view = c(context)
        val lp = lpc(ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        view.layoutParams = lp
        view.init(lp)
        addView(view)
        return view
    }

    override inline fun V.textView(init: (@XDslMarker TextView).(LP) -> Unit)
            = view(::TextView, init)

    override inline fun V.imageView(init: (@XDslMarker ImageView).(LP) -> Unit)
            = view(::ImageView, init)

    override inline fun V.guideline(init: (@XDslMarker Guideline).(LP) -> Unit)
            = view(::Guideline, init)

    override inline fun V.linearLayout(init: (@XDslMarker _LinearLayout).(LP) -> Unit)
            = view(::_LinearLayout, init)

    override inline fun V.relativeLayout(init: (@XDslMarker _RelativeLayout).(LP) -> Unit)
            = view(::_RelativeLayout, init)

    override inline fun V.constraintLayout(init: (@XDslMarker _ConstraintLayout).(LP) -> Unit)
            = view(::_ConstraintLayout, init)

    override inline fun V.button(init: (Button).(LP) -> Unit): Button
            = view(::Button, init)

    override inline fun V.toggleButton(init: (ToggleButton).(LP) -> Unit): ToggleButton
            = view(::ToggleButton, init)

    override inline fun V.checkBox(init: (CheckBox).(LP) -> Unit): CheckBox
            = view(::CheckBox, init)

    override inline fun V.radioButton(init: (RadioButton).(LP) -> Unit): RadioButton
            = view(::RadioButton, init)

    override inline fun V.spinner(init: (Spinner).(LP) -> Unit): Spinner
            = view(::Spinner, init)

    override inline fun V.progressBar(init: (ProgressBar).(LP) -> Unit): ProgressBar
            = view(::ProgressBar, init)

    override inline fun V.seekBar(init: (SeekBar).(LP) -> Unit): SeekBar
            = view(::SeekBar, init)

    override inline fun V.quickContactBadge(init: (QuickContactBadge).(LP) -> Unit): QuickContactBadge
            = view(::QuickContactBadge, init)

    override inline fun V.ratingBar(init: (RatingBar).(LP) -> Unit): RatingBar
            = view(::RatingBar, init)

    override inline fun V.switch(init: (Switch).(LP) -> Unit): Switch
            = view(::Switch, init)

    override inline fun V.space(init: (Space).(LP) -> Unit): Space
            = view(::Space, init)

    override inline fun V.editText(init: (EditText).(LP) -> Unit): EditText
            = view(::EditText, init)

    override inline fun V.multiAutoCompleteTextView(init: (MultiAutoCompleteTextView).(LP) -> Unit): MultiAutoCompleteTextView
            = view(::MultiAutoCompleteTextView, init)

    override inline fun V.gridLayout(init: (GridLayout).(LP) -> Unit): GridLayout
            = view(::_GridLayout, init)

    override inline fun V.frameLayout(init: (FrameLayout).(LP) -> Unit): FrameLayout
            = view(::_FrameLayout, init)

    override inline fun V.tableRow(init: (TableRow).(LP) -> Unit): TableRow
            = view(::_TableRow, init)

    override inline fun V.radioGroup(init: (RadioGroup).(LP) -> Unit): RadioGroup
            = view(::_RadioGroup, init)

    override inline fun V.listView(init: (ListView).(LP) -> Unit): ListView
            = view(::ListView, init)

    override inline fun V.gridView(init: (GridView).(LP) -> Unit): GridView
            = view(::GridView, init)

    override inline fun V.expandableListView(init: (ExpandableListView).(LP) -> Unit): ExpandableListView
            = view(::ExpandableListView, init)

    override inline fun V.scrollView(init: (ScrollView).(LP) -> Unit): ScrollView
            = view(::_ScrollView, init)

    override inline fun V.horizontalScrollView(init: (HorizontalScrollView).(LP) -> Unit): HorizontalScrollView
            = view(::_HorizontalScrollView, init)

    override inline fun V.tabHost(init: (TabHost).(LP) -> Unit): TabHost
            = view(::_TabHost, init)

    override inline fun V.webView(init: (WebView).(LP) -> Unit): WebView
            = view(::WebView, init)

    override inline fun V.searchView(init: (SearchView).(LP) -> Unit): SearchView
            = view(::SearchView, init)

    override inline fun V.viewPager(init: (ViewPager).(LP) -> Unit): ViewPager
            = view(::ViewPager, init)

    override inline fun V.imageButton(init: (ImageButton).(LP) -> Unit): ImageButton
            = view(::ImageButton, init)

    override inline fun V.videoView(init: (VideoView).(LP) -> Unit): VideoView
            = view(::VideoView, init)

    override inline fun V.timePicker(init: (TimePicker).(LP) -> Unit): TimePicker
            = view(::TimePicker, init)

    override inline fun V.datePicker(init: (DatePicker).(LP) -> Unit): DatePicker
            = view(::DatePicker, init)

    override inline fun V.calendarView(init: (CalendarView).(LP) -> Unit): CalendarView
            = view(::CalendarView, init)

    override inline fun V.chronometer(init: (Chronometer).(LP) -> Unit): Chronometer
            = view(::Chronometer, init)

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override inline fun V.textClock(init: (TextClock).(LP) -> Unit): TextClock
            = view(::TextClock, init)

    override inline fun V.imageSwitcher(init: (ImageSwitcher).(LP) -> Unit): ImageSwitcher
            = view(::ImageSwitcher, init)

    override inline fun V.adapterViewFlipper(init: (AdapterViewFlipper).(LP) -> Unit): AdapterViewFlipper
            = view(::AdapterViewFlipper, init)

    override inline fun V.stackView(init: (StackView).(LP) -> Unit): StackView
            = view(::StackView, init)

    override inline fun V.textSwitcher(init: (TextSwitcher).(LP) -> Unit): TextSwitcher
            = view(::TextSwitcher, init)

    override inline fun V.viewAnimator(init: (ViewAnimator).(LP) -> Unit): ViewAnimator
            = view(::ViewAnimator, init)

    override inline fun V.viewFlipper(init: (ViewFlipper).(LP) -> Unit): ViewFlipper
            = view(::ViewFlipper, init)

    override inline fun V.viewSwitcher(init: (ViewSwitcher).(LP) -> Unit): ViewSwitcher
            = view(::ViewSwitcher, init)

    override inline fun V.textureView(init: (TextureView).(LP) -> Unit): TextureView
            = view(::TextureView, init)

    override inline fun V.surfaceView(init: (SurfaceView).(LP) -> Unit): SurfaceView
            = view(::SurfaceView, init)

    override inline fun V.numberPicker(init: (NumberPicker).(LP) -> Unit): NumberPicker
            = view(::NumberPicker, init)

    override inline fun V.toolbar(init: (Toolbar).(LP) -> Unit): Toolbar
            = view(::_Toolbar, init)
}