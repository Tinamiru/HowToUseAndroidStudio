package kr.co.aiai.myapp3

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread


class MainActivitySurface : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var svm = SurfaceViewMe(this)

        setContentView(svm)
//        svm.invalidate()

        thread (start = true) {
            for(i: Int in 1..9){
                Thread.sleep(1000)
                Log.d("taekwon_view", "i = ${i}")
                svm.invalidate()
            }
        }

    }



}