package kr.co.aiai.myapp3

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(ViewMe(this));
    }


    private class ViewMe(context: Context?) : View(context) {
        var cnt: Int = 0
        override fun onDraw(canvas: Canvas) {
            val paint = Paint()
            paint.setColor(Color.RED)
            // paint.setAlpha(125);
            val matrix = Matrix()
            canvas.setMatrix(matrix)
            canvas.drawText("Hello Graphic " + cnt, 100f, 100f, paint)
            super.onDraw(canvas)
            cnt++
            Thread.sleep(1000)
            invalidate()
        }
    }
}


