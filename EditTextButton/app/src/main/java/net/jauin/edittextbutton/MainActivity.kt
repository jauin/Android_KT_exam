package net.jauin.edittextbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_result : TextView = findViewById(R.id.tv_result)
        val btn_getText : Button = findViewById(R.id.btn_getText)
        val et_input : TextView = findViewById(R.id.et_id)

        btn_getText.setOnClickListener {
            val resultText = et_input.text.toString()
            tv_result.setText(resultText)
        }




    }
}