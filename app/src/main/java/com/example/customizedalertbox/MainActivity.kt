package com.example.customizedalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var dialog: Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myButton = findViewById<Button>(R.id.mainButton)
        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        var btnGood = dialog.findViewById<Button>(R.id.btnGood)
        var btnFeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        btnGood.setOnClickListener {
            dialog.dismiss()
        }

        btnFeedback.setOnClickListener {
            dialog.dismiss()
        }

        myButton.setOnClickListener {
            dialog.show()
        }

    }
}