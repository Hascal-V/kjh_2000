package com.hascal.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvDate = findViewById<TextView>(R.id.tv_date)

        val cardAlert = findViewById<View>(R.id.card_alert)

        val cardCL = cardAlert.findViewById<ConstraintLayout>(R.id.card_cl)

        var swCard = cardCL.findViewById<Switch>(R.id.switchAlert)

        val fabAdd = findViewById<FloatingActionButton>(R.id.fabAdd)

        var timeal = cardCL.findViewById<TextView>(R.id.timeAlert)
        var timeal2 = cardCL.findViewById<TextView>(R.id.timeAlert2)
        var dateal = cardCL.findViewById<TextView>(R.id.dateAlert)

        if (swCard.isChecked) {
            timeal.setTextColor(resources.getColor(R.color.black))
            timeal2.setTextColor(resources.getColor(R.color.black))
            dateal.setTextColor(resources.getColor(R.color.black))
        }
        else {
            timeal.setTextColor(resources.getColor(R.color.gray))
            timeal2.setTextColor(resources.getColor(R.color.gray))
            dateal.setTextColor(resources.getColor(R.color.gray))
        }

        swCard.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                timeal.setTextColor(resources.getColor(R.color.black))
                timeal2.setTextColor(resources.getColor(R.color.black))
                dateal.setTextColor(resources.getColor(R.color.black))
            }
            else {
                timeal.setTextColor(resources.getColor(R.color.gray))
                timeal2.setTextColor(resources.getColor(R.color.gray))
                dateal.setTextColor(resources.getColor(R.color.gray))
            }
        }

        fabAdd.setOnClickListener {
            val intent = Intent(this, CreateAlertActivity::class.java)
            startActivity(intent)
        }
    }
}