package com.x.frame.sample

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import com.x.frame.constraintLayout
import com.x.frame.logError

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var t1 = System.currentTimeMillis()
        setContentView(createView())
        var t2 = System.currentTimeMillis()

        logError(t2 - t1)
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
            setTextColor(0xff000000.toInt())
            text = "薛"
            textSize = 30f
        }

        textView {
            id = R.id.text2
            it.topToBottom = R.id.guide
            it.leftToRight = R.id.text1
            it.rightToLeft = R.id.text3
            it.horizontalChainStyle = ConstraintLayout.LayoutParams.CHAIN_PACKED
            setTextColor(0xff000000.toInt())
            text = "力"
            textSize = 30f
        }

        textView {
            id = R.id.text3
            it.topToBottom = R.id.guide
            it.leftToRight = R.id.text2
            it.rightToRight = R.id.root
            it.horizontalChainStyle = ConstraintLayout.LayoutParams.CHAIN_PACKED
            setTextColor(0xff000000.toInt())
            text = "于"
            textSize = 30f
        }
    }
}