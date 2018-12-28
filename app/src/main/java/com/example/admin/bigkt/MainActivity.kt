package com.example.admin.bigkt

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import org.jetbrains.anko.toast

/**
 * button 收起与展开
 */
class MainActivity : AppCompatActivity() {
    var open = true
    private val bt: Button
        get() {
            val bt = findViewById<Button>(R.id.bt)
            return bt
        }

    private val tv1: Button
        get() {
            val tv1 = findViewById<Button>(R.id.tv1)
            return tv1
        }
    private val tv2: Button
        get() {
            val tv1 = findViewById<Button>(R.id.tv2)
            return tv1
        }
    private val tv3: Button
        get() {
            val tv1 = findViewById<Button>(R.id.tv3)
            return tv1
        }
    private val tv4: Button
        get() {
            val tv1 = findViewById<Button>(R.id.tv4)
            return tv1
        }

    @TargetApi(Build.VERSION_CODES.
        LOLLIPOP)
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv1.setOnClickListener { toast("点击点                                                                                                                                                                                                                        击") }
        bt.setOnClickListener {
            when (open) {
                true -> {
                    off(tv1, tv2, tv3, tv4)
                }
                else -> {
                    on(tv1, tv2, tv3, tv4)
                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun on(vararg views: View) {
        for (v in views) {
           /* v.alpha = 0f*/
            v.visibility = View.VISIBLE
            v.animate()
                /*.alpha(1f)*/
                .setDuration(200)
                .translationY(0f)/*.setListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationStart(animation: Animator?) {
            }

            override fun onAnimationEnd(animation: Animator?) {

            }
        })*/.withEndAction { print(66666666666) }.start()
        }
        open = true
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    fun off(vararg views: View) {
        for (v in views) {
           /* v.alpha = 1f*/
            println("height start:" + v.height)
            println("translationY start:" + v.translationY)
            v.animate()
                .setDuration(200)/*.alpha(0f)*/
                .translationY((bt.top-v.top).toFloat())
                .withEndAction {
                    println("height end:" + v.height)
                    println("translationY end:" + v.translationY)
                }
                .start()
        }
        open = false
    }
}
