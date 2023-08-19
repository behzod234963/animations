package uz.datatalim.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.skyfishjy.library.RippleBackground

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {

        val btnRipple_main:Button=findViewById(R.id.ripple)
        val ivImage_main:ImageView=findViewById(R.id.ivImage_main)
        val btnZoom_main:Button=findViewById(R.id.btnZoom_main)
        val btnRotate_main:Button=findViewById(R.id.btnRotate_main)
        val btnFade_main:Button=findViewById(R.id.btnFade_main)
        val btnBlink_main:Button=findViewById(R.id.btnBlink_main)
        val btnMove_main:Button=findViewById(R.id.btnMove_main)
        val btnSlide_main:Button=findViewById(R.id.btnSlide_main)


        btnZoom_main.setOnClickListener {

            val zoomIn=AnimationUtils.loadAnimation(this,R.anim.anim_zoom_in)
            ivImage_main.startAnimation(zoomIn)

        }

        btnRotate_main.setOnClickListener {

            val rotate=AnimationUtils.loadAnimation(this,R.anim.anim_rotate_clockwise)
            ivImage_main.startAnimation(rotate)

        }

        btnFade_main.setOnClickListener {

            val fadeIn=AnimationUtils.loadAnimation(this,R.anim.anim_fade_in)
            ivImage_main.startAnimation(fadeIn)

        }

        btnBlink_main.setOnClickListener {

            val blink=AnimationUtils.loadAnimation(this,R.anim.anim_blink)
            ivImage_main.startAnimation(blink)

        }

        btnMove_main.setOnClickListener {

            val move=AnimationUtils.loadAnimation(this,R.anim.anim_move)
            ivImage_main.startAnimation(move)

        }

        btnSlide_main.setOnClickListener {

            val slideRight=AnimationUtils.loadAnimation(this,R.anim.anim_slide_right)
            ivImage_main.startAnimation(slideRight)

        }

    }
}