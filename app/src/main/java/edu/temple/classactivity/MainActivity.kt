package edu.temple.classactivity

import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMeButton = findViewById(R.id.button)

        clickMeButton.setOnClickListener {
            clickMeButton.text = "Button clicked"
        }

        //
        //val ocl = object: OnClickListener {
        //    override fun onClick(p0: View?) {
        //        (p0 as Button).text = "Button clicked"
        //    }
        //}
        //
    }
}