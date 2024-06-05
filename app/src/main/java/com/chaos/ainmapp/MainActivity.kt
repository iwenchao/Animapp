package com.chaos.ainmapp

import android.graphics.Path
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.chaos.anim.animateFireworks
import com.chaos.anim.animatePath
import com.chaos.anim.animateWaterDrop

/**
 * @Author      : wen
 * @Email       : iwenchaos6688@163.com
 * @Date        : on 2024/6/5 11:12.
 * @Description :描述
 */
class MainActivity:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myView: View = findViewById(R.id.my_view)
        val fireworksButton: View = findViewById(R.id.fireworks_button)
        val waterDropButton: View = findViewById(R.id.waterdrop_button)
        val pathButton: View = findViewById(R.id.path_button)

        fireworksButton.setOnClickListener {
            // Fireworks effect with sequential execution
            myView.animateFireworks(1000)
                .playSequentially()
                .start()
        }

        waterDropButton.setOnClickListener {
            // Water drop effect with concurrent execution
            myView.animateWaterDrop(1000)
                .playTogether()
                .start()
        }
        pathButton.setOnClickListener {
            val path = Path().apply {
                moveTo(myView.x, myView.y)
                quadTo(myView.x + 300, myView.y + 300, myView.x + 600, myView.y)  // 二次贝塞尔曲线
            }

            myView.animatePath(path, 2000)
                .start()
        }
    }


}