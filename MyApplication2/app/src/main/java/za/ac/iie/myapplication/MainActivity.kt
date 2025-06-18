package za.ac.iie.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val edtNum1 = findViewById<EditText>(R.id.edtNum1)
        val edtNum2 = findViewById<EditText>(R.id.edtNum2)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnsub)
        val txtAns = findViewById<TextView>(R.id.txtAns)


        btnAdd.setOnClickListener{
            val number1 = edtNum1.text.toString().toIntOrNull()?: 0
            val number2 = edtNum2.text.toString().toIntOrNull()?: 0

            val result = number1 + number2
            txtAns.text = "Sum is : $result"

        }
        btnSubtract.setOnClickListener(){
            val number1 = edtNum1.text.toString().toIntOrNull()?: 0
            val number2 = edtNum2.text.toString().toIntOrNull()?: 0


            val result = number1 - number2
            txtAns.text = "Sum is : $result"
        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}