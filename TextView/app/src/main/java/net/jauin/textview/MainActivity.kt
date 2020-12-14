package net.jauin.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) { // 앱 최초 실행 때 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 코틀린에서 접근하는 방법 (layout ID 접근)
        val tv_title : TextView = findViewById(R.id.tv_title)
        tv_title.text = "hello ! J" // == tv_title.setText("hello ! J")



    }
}