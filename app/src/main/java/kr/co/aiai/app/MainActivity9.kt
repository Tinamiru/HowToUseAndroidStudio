package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.co.aiai.app.databinding.ActivityMain9Binding

abstract class MainActivity9 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMain9Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main9)

        setContentView(R.layout.activity_main9)

        binding.btn0.setOnClickListener { appendOnClick(true, "0")  }
        binding.btn1.setOnClickListener { appendOnClick(true, "1") }
        binding.btn2.setOnClickListener { appendOnClick(true, "2") }
        binding.btn3.setOnClickListener { appendOnClick(true, "3") }
        binding.btn4.setOnClickListener { appendOnClick(true, "4") }
        binding.btn5.setOnClickListener { appendOnClick(true, "5") }
        binding.btn6.setOnClickListener { appendOnClick(true, "6") }
        binding.btn7.setOnClickListener { appendOnClick(true, "7") }
        binding.btn8.setOnClickListener { appendOnClick(true, "8") }
        binding.btn9.setOnClickListener { appendOnClick(true, "9") }
        binding.btnDel.setOnClickListener {  }
        binding.btnCall.setOnClickListener {  }

        binding.activity = this@MainActivity

        val tv = findViewById<TextView>(R.id.tv)


    }
        fun btnClick(view : View){
            Toast.makeText(this,"Button Click",Toast.LENGTH_SHORT).show()
        }

}