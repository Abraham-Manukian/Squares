package com.raywenderlich.squares

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Random
//Объявление глобальных переменных

private lateinit var button1: Button
private lateinit var button2: Button
private lateinit var button3: Button
private lateinit var button4: Button
private lateinit var button5: Button
private lateinit var button6: Button
private lateinit var button7: Button
private lateinit var button8: Button
private lateinit var button9: Button
private lateinit var score: TextView
private var counter: Int = 0

class MainActivity : AppCompatActivity() {
    //создание массивов
    var field = arrayOf<Array<Int>>() //Массив значений
    val intervalButtons: Array<Button> by lazy { //массив кнопок
        arrayOf(
            findViewById<Button>(R.id.button1),
            findViewById<Button>(R.id.button2),
            findViewById<Button>(R.id.button3),
            findViewById<Button>(R.id.button4),
            findViewById<Button>(R.id.button5),
            findViewById<Button>(R.id.button6),
            findViewById<Button>(R.id.button7),
            findViewById<Button>(R.id.button8),
            findViewById<Button>(R.id.button9),
        )
    }
    var random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        score = findViewById(R.id.score)
        //заполнение массива значений
        for (i in 0..2) {
            var array = arrayOf<Int>()
            for (j in 0..2) {
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

        for (x in 0..2){
            for (y in 0..2){
                a += field[x][y]
            }
        }
        if (a == 0 || a == 9){
            toast.show()
            counter = 0
        }
     }

    @SuppressLint("ResourceAsColor")
    fun color(array: Int){
       for (i in 0..2){
            for (n in 0..2){
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
        for (y in 0..2){
            if (field[x][y] == 0){
                field[x][y] = 1
            }
            else{
                field[x][y] = 0
            }
        }
        for (x in 0..2){
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
        score.text = "$counter ходов"
    }

    fun click1(view: View){
        alter(x = 0, y = 0)
        color(0)
    }
    fun click2(view: View){
        alter(x = 1, y = 0) //0 1
        color(1)
    }
    fun click3(view: View){
        alter(x = 2, y = 0) // 0 2
        color(2)
    }
    fun click4(view: View){
        alter(x = 0, y = 1)
        color(3)
    }
    fun click5(view: View){
        alter(x = 1, y = 1)
        color(4)
    }
    fun click6(view: View){
        alter(x = 2, y = 1)
        color(5)
    }
    fun click7(view: View){
        alter(x = 0, y = 2)
        color(6)
    }
    fun click8(view: View){
        alter(x = 1, y = 2)
        color(7)
    }
    fun click9(view: View){
        alter(x = 2, y = 2)
        color(8)
    }
    fun start(view: View) {
        //array(2)
       color(2)
       for (array in field) {
            for (filed in array) {
                print("$filed ")
            }
            println()
        }
        println(counter)
    }
    fun click_to4 (view: View){
        val intent = Intent(this@MainActivity, four_by_four::class.java)
        startActivity(intent)
        print(counter)
    }

    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }//анонимный метод
}

