package com.chaos.anim

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
/**
 * @Author      : wen
 * @Email       : iwenchaos6688@163.com
 * @Date        : on 2024/6/5 11:10.
 * @Description : 动效
 */
class EffectAnimation(private val view: View) {

    private val animatorSet = AnimatorSet()

    fun fireworks(duration: Long): EffectAnimation {
        val animators = mutableListOf<ObjectAnimator>()
        // Example fireworks effect: scale and alpha animation
        val scaleX = ObjectAnimator.ofFloat(view, "scaleX", 1f, 3f, 1f).apply {
            this.duration = duration
        }
        val scaleY = ObjectAnimator.ofFloat(view, "scaleY", 1f, 3f, 1f).apply {
            this.duration = duration
        }
        val alpha = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 1f).apply {
            this.duration = duration
        }
        animators.add(scaleX)
        animators.add(scaleY)
        animators.add(alpha)
        animatorSet.playTogether(animators as Collection<Animator>?)
        return this
    }

    fun waterDrop(duration: Long): EffectAnimation {
        val animators = mutableListOf<ObjectAnimator>()
        // Example water drop effect: translation and alpha animation
        val translateY = ObjectAnimator.ofFloat(view, "translationY", 0f, 200f, 0f).apply {
            this.duration = duration
        }
        val alpha = ObjectAnimator.ofFloat(view, "alpha", 1f, 0.5f, 1f).apply {
            this.duration = duration
        }
        animators.add(translateY)
        animators.add(alpha)
        animatorSet.playTogether(animators as Collection<Animator>?)
        return this
    }

    fun setDuration(duration: Long): EffectAnimation {
        animatorSet.duration = duration
        return this
    }

    fun setListener(listener: AnimListener): EffectAnimation {
        animatorSet.addListener(listener)
        return this
    }

    fun playTogether(): EffectAnimation {
        animatorSet.playTogether(animatorSet.childAnimations)
        return this
    }

    fun playSequentially(): EffectAnimation {
        animatorSet.playSequentially(animatorSet.childAnimations)
        return this
    }

    fun start() {
        animatorSet.start()
    }
}