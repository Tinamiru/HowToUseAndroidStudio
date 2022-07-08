package kr.co.aiai.app

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val btn = findViewById<Button>(R.id.btn)
        val tv = findViewById<TextView>(R.id.tv)

        btn.setOnClickListener {
            tv.text = ""
            val et1 = et1.text.toString()
            val et2 = et2.text.toString()
            var result: String = ""
            for (i: Int in (et1.toInt())..(et2.toInt())) {
                for (j: Int in 1..i) {
                    result += "*"
                }
                result += "\n"
            }
            tv.append(result)
        }
    }
}