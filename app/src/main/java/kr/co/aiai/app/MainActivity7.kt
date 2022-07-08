package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val btn = findViewById<Button>(R.id.btn)
        val tv = findViewById<TextView>(R.id.tv)

        btn.setOnClickListener {
            val et1 = et1.text
            val comChoice = arrayOf("가위", "바위", "보")
            comChoice.shuffle()
            val result: String = comChoice[0]
            et2.setText(result)
            if (et1.toString() == "가위" || et1.toString() == "바위" || et1.toString() == "보") {
                if (et1.toString() == result) {
                    tv.text = "비겼습니다."
                } else if ((et1.toString() == "가위" && result == "보") || (et1.toString() == "바위" && result == "가위") || (et1.toString() == "보" && result == "바위")) {
                    tv.text = "이겼습니다."
                } else {
                    tv.text = "졌습니다."
                }
            } else {
                tv.text = "가위, 바위, 보만 \n입력하세요"
            }
        }

    }
}