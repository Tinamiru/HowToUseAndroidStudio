package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tv = findViewById<TextView>(R.id.tv)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val tvv = tv.text.toString()
            val num = tvv.toInt() + 1
            tv.text = num.toString()
        }

    }
}