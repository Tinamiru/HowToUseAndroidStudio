package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val btn = findViewById<Button>(R.id.btn)
        val tv = findViewById<TextView>(R.id.tv)

        btn.setOnClickListener {
            val et1 = et1.text
            val comChoice = arrayOf("홀","짝")
            comChoice.shuffle()
            val result : String = comChoice[0]
            et2.setText(result)
            if (et1.toString() == result){
                tv.text = "이겼습니다."
            }else{
                tv.text = "졌습니다."
            }

        }

    }
}