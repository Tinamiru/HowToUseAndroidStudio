package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val tv3 = findViewById<TextView>(R.id.tv3)
        val tv4 = findViewById<TextView>(R.id.tv4)
        val tv5 = findViewById<TextView>(R.id.tv5)
        val tv6 = findViewById<TextView>(R.id.tv6)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val lotto = Array(45,{i->i+1})
            lotto.shuffle()
            val result = arrayOf(lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5])

            result.sort()
            tv1.text = result[0].toString()
            tv2.text = result[1].toString()
            tv3.text = result[2].toString()
            tv4.text = result[3].toString()
            tv5.text = result[4].toString()
            tv6.text = result[5].toString()


        }

    }
}