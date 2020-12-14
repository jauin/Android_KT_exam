package net.jauin.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val tv_getMsg : TextView = findViewById(R.id.tv_getMsg)

        if(intent.hasExtra("msg")){

            tv_getMsg.text = intent.getStringExtra("msg")

        }

    }
}