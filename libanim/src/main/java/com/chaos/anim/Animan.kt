package com.chaos.anim

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

/**
 * @Author      : wen
 * @Email       : iwenchaos6688@163.com
 * @Date        : on 2024/6/5 10:50.
 * @Description :描述
 */
class Animan {
    private val animatorSet = AnimatorSet()
    private val animators = mutableListOf<ObjectAnimator>()

    fun addAlphaAnimation(view: View, fromAlpha: Float, toAlpha: Float, duration: Long): Animan {
        val animator = ObjectAnimator.ofFloat(view, "alpha", fromAlpha, toAlpha).apply {
            this.duration = duration
        }
        animators.add(animator)
        return this
    }

    fun addTranslationAnimation(view: View, fromX: Float, toX: Float, fromY: Float, toY: Float, duration: Long): Animan {
        val animatorX = ObjectAnimator.ofFloat(view, "translationX", fromX, toX).apply {
            this.duration = duration
        }
        val animatorY = ObjectAnimator.ofFloat(view, "translationY", fromY, toY).apply {
            this.duration = duration
        }
        animators.add(animatorX)
        animators.add(animatorY)
        return this
    }

    fun addRotationAnimation(view: View, fromDegrees: Float, toDegrees: Float, duration: Long): Animan {
        val animator = ObjectAnimator.ofFloat(view, "rotation", fromDegrees, toDegrees).apply {
            this.duration = duration
        }
        animators.add(animator)
        return this
    }

    fun addScaleAnimation(view: View, fromScaleX: Float, toScaleX: Float, fromScaleY: Float, toScaleY: Float, duration: Long): Animan {
        val animatorX = ObjectAnimator.ofFloat(view, "scaleX", fromScaleX, toScaleX).apply {
            this.duration = duration
        }
        val animatorY = ObjectAnimator.ofFloat(view, "scaleY", fromScaleY, toScaleY).apply {
            this.duration = duration
        }
        animators.add(animatorX)
        animators.add(animatorY)
        return this
    }

    fun setDuration(duration: Long): Animan {
        animators.forEach { it.duration = duration }
        return this
    }

    fun setListener(listener: AnimListener): Animan {
        animatorSet.addListener(listener)
        return this
    }

    fun start() {
        animatorSet.playTogether(animators as Collection<Animator>?)
        animatorSet.start()
    }


}