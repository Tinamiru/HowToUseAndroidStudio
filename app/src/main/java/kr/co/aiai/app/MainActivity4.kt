package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val et1 = findViewById<TextView>(R.id.et1)
        val et2 = findViewById<TextView>(R.id.et2)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val et1 = et1.text.toString()
            var result : String = ""
            for (i:Int in 1..9){
                result += et1+"*"+i+"="+(et1.toInt() * i)+"\n"
            }
            et2.append(result)
        }

    }
}