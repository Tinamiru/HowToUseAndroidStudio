package org.tensorflow.lite.examples.digitclassifier

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivityHoll : AppCompatActivity() {

  private var holJjakClassifier = DigitClassifierHoll(this)

  @SuppressLint("ClickableViewAccessibility")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main5)

    var et1 = findViewById<EditText>(R.id.et1)
    var et2 = findViewById<EditText>(R.id.et2)
    var tv = findViewById<TextView>(R.id.tv)
    var btn = findViewById<Button>(R.id.btn)
    // Setup digit classifier
    holJjakClassifier
      .initialize()
      .addOnFailureListener { e -> Log.e(TAG, "Error to setting up digit classifier.", e) }

    btn.setOnClickListener {
      var user : String = et1.text.toString()
      var com = ""
      if(user != null){
        holJjakClassifier.classifyAsync(user)
          .addOnSuccessListener { resultText ->

            if (resultText == "0") {
              com = "홀"
            } else if (resultText == "1") {
              com = "짝"
            }

            et2.setText(com)

            var result = if(user == com){
              "COM승리"
            }else{
              "COM패배"
            }
            tv.setText(result)
          }
      }
    }
  }

  override fun onDestroy() {
    holJjakClassifier.close()
    super.onDestroy()
  }

  companion object {
    private const val TAG = "MainActivity"
  }
}