package kr.co.aiai.myapp3


import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.FileOutputStream
import java.io.FileReader


class MainActivityFile : AppCompatActivity() {
    var sharedpreferences: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv01 = findViewById<View>(R.id.tv01) as TextView
        val textWrite = "babowadfafafaef"
        try {
            val fileoutputstream: FileOutputStream =
                openFileOutput("babo.txt", MODE_WORLD_WRITEABLE)
            fileoutputstream.write(textWrite.toByteArray())
            fileoutputstream.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        var textRead = ""

        try {
            val bufferedreader =
                BufferedReader(FileReader("/data/data/kr.or.ddit.app.file/files/babo.txt"))
            var line = ""
            var i = 0
            while (bufferedreader.readLine().also { line = it } != null){
                textRead += i.toString() + ":" + line + "\n"
                i++
            }
        } catch (e: Exception) {
            // TODO Auto-generate
        }
        tv01.text = textRead
    }

}