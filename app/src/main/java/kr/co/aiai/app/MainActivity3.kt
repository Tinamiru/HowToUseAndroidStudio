package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val et1 = findViewById<TextView>(R.id.et1)
        val et2 = findViewById<TextView>(R.id.et2)
        val et3 = findViewById<TextView>(R.id.et3)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val et1 = et1.text.toString()
            val et2 = et2.text.toString()
            val result = et1.toInt() + et2.toInt()
            et3.text = result.toString()
        }

    }
}