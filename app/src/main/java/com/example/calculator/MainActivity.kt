package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var isnewOp = true
    fun butnumber(view: View) {
        if (isnewOp) {
            Result.text = ""
        }
        isnewOp = false
        var viewNum: String = Result.text.toString()
        val buSelect = view as Button
        when (buSelect.id) {
            button_0.id -> {
                viewNum += "0"
            }
            button_1.id -> {
                viewNum += "1"
            }
            button_2.id -> {
                viewNum += "2"
            }
            button_3.id -> {
                viewNum += "3"
            }
            button_4.id -> {
                viewNum += "4"
            }
            button_5.id -> {
                viewNum += "5"
            }
            button_6.id -> {
                viewNum += "6"
            }
            button_7.id -> {
                viewNum += "7"
            }
            button_8.id -> {
                viewNum += "8"
            }
            button_9.id -> {
                viewNum += "8"
            }
            button__.id -> {
                viewNum += "."
                button__.isEnabled = false
            }
            AC_btn.id -> {
                viewNum = ""
            }


        }
        Result.text = viewNum
    }

    var oldNum = ""
    var Operations = "+"
    fun operations(view: View) {
        isnewOp = true
        oldNum = Result.text.toString()
        val butnumber = view as Button
        when (butnumber.id) {
            division_btn.id -> {
                Operations = "/"
            }
            button_x.id -> {
                Operations = "X"
            }
            button_minus.id -> {
                Operations = "-"
            }
            button_plus.id -> {
                Operations = "+"
            }
            nesba_btn.id -> {
                Operations = "%"
            }
            plusminus_btn.id -> {
                Operations = "+/-"
            }
        }

    }

    fun Resultvm(view: View) {
        val newNumbeer = Result.text.toString()
        var finalNumbeeer: Double? = null
        when (Operations) {
            "/" -> {
                finalNumbeeer = oldNum.toDouble() / newNumbeer.toDouble()
            }
            "+/-" -> {
                finalNumbeeer = newNumbeer.toDouble() * -1
            }
            "%" -> {
                finalNumbeeer = newNumbeer.toDouble() / 100
            }
            "X" -> {
                finalNumbeeer = oldNum.toDouble() * newNumbeer.toDouble()
            }
            "+" -> {
                finalNumbeeer = oldNum.toDouble() + newNumbeer.toDouble()
            }
            "-" -> {
                finalNumbeeer = oldNum.toDouble() - newNumbeer.toDouble()
            }
        }
        Result.text = finalNumbeeer.toString()
        isnewOp = true
    }
}


