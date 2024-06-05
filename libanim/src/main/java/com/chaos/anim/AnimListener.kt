package com.chaos.anim

import android.animation.Animator

/**
 * @Author      : wen
 * @Email       : iwenchaos6688@163.com
 * @Date        : on 2024/6/5 10:53.
 * @Description :描述
 */

open class AnimListener : Animator.AnimatorListener {
    override fun onAnimationStart(animation: Animator) {}
    override fun onAnimationEnd(animation: Animator) {}
    override fun onAnimationCancel(animation: Animator) {}
    override fun onAnimationRepeat(animation: Animator) {}
}