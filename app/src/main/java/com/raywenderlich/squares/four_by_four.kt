package com.raywenderlich.squares

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

private lateinit var button4_1: Button
private lateinit var button4_2: Button
private lateinit var button4_3: Button
private lateinit var button4_4: Button
private lateinit var button4_5: Button
private lateinit var button4_6: Button
private lateinit var button4_7: Button
private lateinit var button4_8: Button
private lateinit var button4_10: Button
private lateinit var button4_11: Button
private lateinit var button4_12: Button
private lateinit var button4_13: Button
private lateinit var button4_14: Button
private lateinit var button4_15: Button
private lateinit var button4_16: Button
private lateinit var score_4: TextView
private var counter: Int = 0
class four_by_four : AppCompatActivity() {
   /* var field = arrayOf<Array<Int>>() //Массив значений
    val intervalButtons: Array<Button> by lazy { //массив кнопок
        arrayOf(
            findViewById<Button>(R.id.button4_1),
            findViewById<Button>(R.id.button4_2),
            findViewById<Button>(R.id.button4_3),
            findViewById<Button>(R.id.button4_4),
            findViewById<Button>(R.id.button4_5),
            findViewById<Button>(R.id.button4_6),
            findViewById<Button>(R.id.button4_7),
            findViewById<Button>(R.id.button4_8),
            findViewById<Button>(R.id.button4_9),
            findViewById<Button>(R.id.button4_10),
            findViewById<Button>(R.id.button4_11),
            findViewById<Button>(R.id.button4_12),
            findViewById<Button>(R.id.button4_13),
            findViewById<Button>(R.id.button4_14),
            findViewById<Button>(R.id.button4_15),
            findViewById<Button>(R.id.button4_16),
        )
    }
    var random = Random()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_by_four)
        score_4 = findViewById(R.id.score_4)
        //заполнение массива значений
        for (i in 0..3) {
            var array = arrayOf<Int>()
            for (j in 0..3) {
                array += rand(0, 2)
            }
            field += array
        }
    }
    fun chek(){
        var a = 0
        val text = "Вы победили!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)

        for (x in 0..3){
            for (y in 0..3){
                a = a + field[x][y]
            }
        }
        if (a == 0 || a == 16){
            toast.show()
            counter = 0
        }
    }
    @SuppressLint("ResourceAsColor")
    fun color(array: Int){
        for (i in 0..3){
            for (n in 0..3){
                if (field[i][n] == 1){
                    //button[i + n * 3].setBackgroundColor(Color.GREEN)
                    intervalButtons[i + n * 3].setBackgroundColor(Color.GREEN)
                }
                else{
                    //button[i + n * 3].setBackgroundColor(Color.RED)
                    intervalButtons[i + n * 3].setBackgroundColor(Color.RED)  //setBackgroundResource(R.color.button)
                }
            }
        }
    }
    fun alter(x:Int, y:Int ){
        for (y in 0..3){
            if (field[x][y] == 0){
                field[x][y] = 1
            }
            else{
                field[x][y] = 0
            }
        }
        for (x in 0..3){
            if (field[x][y] == 0){
                field[x][y] = 1
            }
            else{
                field[x][y] = 0
            }
        }
        if (field[x][y] == 0){
            field[x][y] = 1
        }
        else{
            field[x][y] = 0
        }
        chek()
        score()
    }
    fun score(){
        counter++
        score_4.text = "$counter ходов"
    }

    fun click4_1(view: View){
        alter(x = 0, y = 0)
        color(0)
    }
    fun click4_2(view: View){
        alter(x = 1, y = 0) //0 1
        color(1)
    }
    fun click4_3(view: View){
        alter(x = 2, y = 0) // 0 2
        color(2)
    }
    fun click4_4(view: View){
        alter(x = 3, y = 0)
        color(3)
    }
    fun click4_5(view: View){
        alter(x = 0, y = 1)
        color(4)
    }
    fun click4_6(view: View){
        alter(x = 1, y = 1)
        color(5)
    }
    fun click4_7(view: View){
        alter(x = 2, y = 1)
        color(6)
    }
    fun click4_8(view: View){
        alter(x = 3, y = 1)
        color(7)
    }
    fun click4_9(view: View){
        alter(x = 0, y = 2)
        color(8)
    }
    fun click4_10(view: View){
        alter(x = 1, y = 2)
        color(9)
    }
    fun click4_11(view: View){
        alter(x = 2, y = 2)
        color(10)
    }
    fun click4_12(view: View){
        alter(x = 3, y = 2)
        color(11)
    }
    fun click4_13(view: View){
        alter(x = 0, y = 3)
        color(12)
    }
    fun click4_14(view: View){
        alter(x = 1, y = 3)
        color(13)
    }
    fun click4_15(view: View){
        alter(x = 2, y = 3)
        color(14)
    }
    fun click4_16(view: View){
        alter(x = 3, y = 3)
        color(15)
    }
    fun start_4(view: View) {
        //array(2)
        color(0)
        for (array in field) {
            for (filed in array) {
                print("$filed ")
            }
            println()
        }
        println(counter)
    }

    fun click_to3 (view: View){
        /*val intent = Intent(this@four_by_four, MainActivity::class.java)
        startActivity(intent)*/
        println(counter)
    }

    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }*/
}