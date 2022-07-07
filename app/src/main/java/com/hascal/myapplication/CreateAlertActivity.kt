package com.hascal.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.nex3z.togglebuttongroup.MultiSelectToggleGroup

class CreateAlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_alert)

        val mainBack = findViewById<ImageButton>(R.id.mainBack)

        val buttonGroup = findViewById<MultiSelectToggleGroup>(R.id.dateButtonGroup)

        buttonGroup.setOnCheckedChangeListener { group, checkedId, isChecked ->

        }

        mainBack.setOnClickListener {
            finish()
        }


    }
}