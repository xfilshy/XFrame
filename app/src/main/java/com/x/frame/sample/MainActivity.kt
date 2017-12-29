package com.x.frame.sample

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.widget.SeekBar
import com.x.frame.constraintLayout
import com.x.frame.spacingExtra
import com.x.frame.spacingMultiplier
import com.x.frame.textColor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var t1 = System.currentTimeMillis()
//        setContentView(createView())
//        var t2 = System.currentTimeMillis()
//        logError(t2 - t1)
    }

    inline fun createView() = constraintLayout {
        id = R.id.root

        guideline {
            id = R.id.guide
            it.orientation = ConstraintLayout.LayoutParams.HORIZONTAL
            it.topToTop = R.id.root
            it.guideBegin = 10
        }

        textView {
            id = R.id.text1
            it.topToBottom = R.id.guide
            it.leftToLeft = R.id.root
            it.rightToLeft = R.id.text2
            it.horizontalChainStyle = ConstraintLayout.LayoutParams.CHAIN_PACKED
            text = "薛\n力\n于"
            textColor = R.drawable.blacklight_enable
            textSize = 30f
        }

        textView {
            id = R.id.text2
            it.topToBottom = R.id.guide
            it.leftToRight = R.id.text1
            it.rightToLeft = R.id.text3
            it.horizontalChainStyle = ConstraintLayout.LayoutParams.CHAIN_PACKED
            text = "薛\n力\n于"
            textColor = R.color.colorPrimaryDark
            textSize = 30f
            spacingExtra = 0f
            spacingMultiplier = 0.8f
        }

        textView {
            id = R.id.text3
            it.topToBottom = R.id.guide
            it.leftToRight = R.id.text2
            it.rightToRight = R.id.root
            it.horizontalChainStyle = ConstraintLayout.LayoutParams.CHAIN_PACKED
            text = "薛\n力\n于"
            textColor = 0xff00ffff
            textSize = 30f
            spacingExtra = 0f
            spacingMultiplier = 2f
        }

        seekBar {
            id = R.id.img1
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                }

                override fun onStartTrackingTouch(p0: SeekBar?) {

                }

                override fun onStopTrackingTouch(p0: SeekBar?) {

                }

            })
        }
    }
}


