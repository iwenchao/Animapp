package com.chaos.anim

import android.animation.ObjectAnimator
import android.graphics.Path
import android.view.View

/**
 * @Author      : wen
 * @Email       : iwenchaos6688@163.com
 * @Date        : on 2024/6/5 10:57.
 * @Description : 动画路径
 */
class PathAnimation(private val view:View) {
    private var path: Path? = null
    private var duration: Long = 300
    private var repeatCount: Int = 0
    private var repeatMode: Int = ObjectAnimator.RESTART

    fun setPath(path: Path): PathAnimation {
        this.path = path
        return this
    }

    fun setDuration(duration: Long): PathAnimation {
        this.duration = duration
        return this
    }

    fun setRepeatCount(repeatCount: Int): PathAnimation {
        this.repeatCount = repeatCount
        return this
    }

    fun setRepeatMode(repeatMode: Int): PathAnimation {
        this.repeatMode = repeatMode
        return this
    }

    fun start() {
        path?.let {
            val animator = ObjectAnimator.ofFloat(view, View.X, View.Y, it).apply {
                this.duration = this@PathAnimation.duration
                this.repeatCount = this@PathAnimation.repeatCount
                this.repeatMode = this@PathAnimation.repeatMode
            }
            animator.start()
        }
    }
}