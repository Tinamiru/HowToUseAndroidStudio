package kr.co.aiai.app

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.co.aiai.app.databinding.ActivityMain9Binding
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity9 : AppCompatActivity() {

    private lateinit var binding: ActivityMain9Binding

    val okButtonClick = { dialogInterface: DialogInterface, i: Int ->
        if (binding.tv.text.toString().length == 0) {
            toast("번호를 입력하십시오.")
        } else {
            toast(binding.tv.text.toString() + "로 전화를 겁니다.")
        }
    }
    val cancleButtonClick = { dialogInterface: DialogInterface, i: Int ->
        toast("전화가 취소되었습니다.")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain9Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btn1.setOnClickListener { appendOnClick("1") }
        binding.btn2.setOnClickListener { appendOnClick("2") }
        binding.btn3.setOnClickListener { appendOnClick("3") }
        binding.btn4.setOnClickListener { appendOnClick("4") }
        binding.btn5.setOnClickListener { appendOnClick("5") }
        binding.btn6.setOnClickListener { appendOnClick("6") }
        binding.btn7.setOnClickListener { appendOnClick("7") }
        binding.btn8.setOnClickListener { appendOnClick("8") }
        binding.btn9.setOnClickListener { appendOnClick("9") }
        binding.btn0.setOnClickListener { appendOnClick("0") }
        binding.btnDel.setOnClickListener { deleteOnClick() }
        binding.btnCall.setOnClickListener {
            val builder = AlertDialog.Builder(this)
                .setTitle("번호 : " + binding.tv.text.toString())
                .setMessage("전화를 거시겠습니까?")
                .setPositiveButton("확인", okButtonClick)
                .setNegativeButton("취소", cancleButtonClick)
                .show()
        }
    }

    private fun deleteOnClick() {
        var oldText = binding.tv.text.toString()
        if (oldText.length > 0) {
            if (oldText.length == 5 || oldText.length == 10) {
                binding.tv.text = oldText.substring(0, oldText.length - 2)
            } else {
                binding.tv.text = oldText.substring(0, oldText.length - 1)
            }
        }
    }

    private fun appendOnClick(s: String) {

        var oldText = binding.tv.text.toString()
        if (oldText.length == 3 || oldText.length == 8)
            oldText += "-"
        oldText += s
        binding.tv.text = oldText
    }

    fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
