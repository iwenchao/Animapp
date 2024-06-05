package com.chaos.anim

/**
 * @Author      : wen
 * @Email       : iwenchaos6688@163.com
 * @Date        : on 2024/6/5 10:51.
 * @Description :描述
 */

import android.view.View

fun View.animateAlpha(fromAlpha: Float, toAlpha: Float, duration: Long): Animan {
    return Animan().addAlphaAnimation(this, fromAlpha, toAlpha, duration)
}

fun View.animateTranslation(fromX: Float, toX: Float, fromY: Float, toY: Float, duration: Long): Animan {
    return Animan().addTranslationAnimation(this, fromX, toX, fromY, toY, duration)
}

fun View.animateRotation(fromDegrees: Float, toDegrees: Float, duration: Long): Animan {
    return Animan().addRotationAnimation(this, fromDegrees, toDegrees, duration)
}

fun View.animateScale(fromScaleX: Float, toScaleX: Float, fromScaleY: Float, toScaleY: Float, duration: Long): Animan {
    return Animan().addScaleAnimation(this, fromScaleX, toScaleX, fromScaleY, toScaleY, duration)
}