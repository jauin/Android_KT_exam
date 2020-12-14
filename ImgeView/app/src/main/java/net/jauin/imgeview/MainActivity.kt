package net.jauin.imgeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_toast : Button = findViewById(R.id.btn_toast)
        val iv_profile : ImageView = findViewById(R.id.iv_profile)


        btn_toast.setOnClickListener(){

            Toast.makeText(this@MainActivity, "버튼이 클릭되었습니다.", Toast.LENGTH_SHORT).show()

            iv_profile.setImageResource(R.drawable.android_2_512)

        }

    }
}
