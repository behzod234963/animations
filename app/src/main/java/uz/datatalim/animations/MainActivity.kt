package uz.datatalim.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView
import com.skyfishjy.library.RippleBackground

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {

        val lottie:LottieAnimationView=findViewById(R.id.lottie)
        val btnPlay:Button=findViewById(R.id.btnPlay)
        val btnPause:Button=findViewById(R.id.btnPause)
        val ivImage_main:ImageView=findViewById(R.id.ivImage_main)
        val btnZoom_main:Button=findViewById(R.id.btnZoom_main)
        val btnRotate_main:Button=findViewById(R.id.btnRotate_main)
        val btnFade_main:Button=findViewById(R.id.btnFade_main)
        val btnBlink_main:Button=findViewById(R.id.btnBlink_main)
        val btnMove_main:Button=findViewById(R.id.btnMove_main)
        val btnSlide_main:Button=findViewById(R.id.btnSlide_main)


        btnZoom_main.setOnClickListener {

            val zoomIn=AnimationUtils.loadAnimation(this,R.anim.anim_zoom_in)
            lottie.startAnimation(zoomIn)

        }

        btnRotate_main.setOnClickListener {

            val rotate=AnimationUtils.loadAnimation(this,R.anim.anim_rotate_clockwise)
            lottie.startAnimation(rotate)

        }

        btnFade_main.setOnClickListener {

            val fadeIn=AnimationUtils.loadAnimation(this,R.anim.anim_fade_in)
            lottie.startAnimation(fadeIn)

        }

        btnBlink_main.setOnClickListener {

            val blink=AnimationUtils.loadAnimation(this,R.anim.anim_blink)
            lottie.startAnimation(blink)

        }

        btnMove_main.setOnClickListener {

            val move=AnimationUtils.loadAnimation(this,R.anim.anim_move)
            lottie.startAnimation(move)

        }

        btnSlide_main.setOnClickListener {

            val slideRight=AnimationUtils.loadAnimation(this,R.anim.anim_slide_right)
            lottie.startAnimation(slideRight)

        }
        btnPlay.setOnClickListener {

            var play=0
            val pause=1
            lottie.playAnimation()
            play=2

            if (play>0){

                lottie.pauseAnimation()

            }

        }

        btnPause.setOnClickListener {


        }

    }
}