package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val tv = findViewById<TextView>(R.id.tv)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val et1 = et1.text.toString()
            val et2 = et2.text.toString()
            var result : Int = 0
            for (i: Int in (et1.toInt())..(et2.toInt())) {
                result += i
            }
            tv.text = result.toString()
        }

    }
}