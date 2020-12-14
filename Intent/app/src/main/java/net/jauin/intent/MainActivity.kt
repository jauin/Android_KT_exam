package net.jauin.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_a : Button = findViewById(R.id.btn_a)
        val tv_sendMsg : TextView = findViewById(R.id.tv_sendMsg)


        btn_a.setOnClickListener {

            val intent = Intent(this,SubActivity::class.java)
//            intent.putExtra("msg", tv_sendMsg.text.toString())
            startActivity(intent)


        }
    }
}


