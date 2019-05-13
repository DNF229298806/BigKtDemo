package com.example.admin.bigkt

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import com.blankj.utilcode.util.SPUtils
import com.blankj.utilcode.util.ToastUtils
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

/**
 * button 收起与展开
 */
class MainActivity : AppCompatActivity() {
    var open = true
    var count = 1
    var size: Int = 2
        set(value) {
            Log.e("text", "count : ${count++}")
            Log.e("text", "old_size:${size}")
            size = if (value > 10) 15 else 0
            Log.e("text", "new_size:${size}")
            field = value
        }



    @TargetApi(
        Build.VERSION_CODES.LOLLIPOP
    )
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

        findViewById<Button>(R.id.sp_put).setOnClickListener { SPUtils.getInstance().put("alibaba", "一起来修复包！！！！！！")
            size = 9
        }
        findViewById<Button>(R.id.sp_get).setOnClickListener { ToastUtils.showLong(SPUtils.getInstance().getString("alibaba")) }
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
                .translationY((bt.top - v.top).toFloat())
                .withEndAction {
                    println("height end:" + v.height)
                    println("translationY end:" + v.translationY)
                }
                .start()
        }
        open = false
    }
}
