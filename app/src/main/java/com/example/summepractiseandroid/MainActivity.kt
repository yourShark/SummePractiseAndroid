package com.example.summepractiseandroid
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editPersonName: EditText
    private lateinit var editNumberHeight: EditText
    private lateinit var editNumWeight: EditText
    private lateinit var editNumAge: EditText
    private lateinit var btn: Button
    private lateinit var resultInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPersonName = findViewById(R.id.et_PersonName)
        editNumberHeight = findViewById(R.id.et_NumberHeight)
        editNumWeight = findViewById(R.id.et_NumWeight)
        editNumAge = findViewById(R.id.et_NumAge)
        btn = findViewById(R.id.button)
        resultInfo = findViewById(R.id.textOutput)

        btn.setOnClickListener {
            if(editPersonName.text.toString() == ""
                || editNumAge.text.toString() == ""
                || editNumberHeight.text.toString() == ""
                || editNumWeight.text.toString() == "") {
                resultInfo.text = "Данные введены некорректно"
            } else
                if(editPersonName.text.length > 50
                    || editNumAge.text.toString().toInt() >= 150
                    || editNumberHeight.text.toString().toInt() >= 250
                    || editNumWeight.text.toString().toDouble() >= 250
                    || editNumAge.text.toString().toInt() <= 0
                    || editNumberHeight.text.toString().toInt() <= 0
                    || editNumWeight.text.toString().toDouble() <= 0) {
                    resultInfo.text = "Данные введены некорректно"
                } else {
                    val name: String = editPersonName.text.toString()
                    val height: Int = editNumberHeight.text.toString().toInt()
                    val weight: Double = editNumWeight.text.toString().toDouble()
                    val age: Int = editNumAge.text.toString().toInt()
                    val value: Double =  88.36 + (13.4 * weight) +
                            (4.8 * height) - (5.7 * age) + name.length
                    resultInfo.text = "Ответ: $value"
                }
        }
    }
}