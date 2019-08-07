package  com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportActionBar != null)
        {
            supportActionBar!!.hide();
        }

        btnRandom.setOnClickListener(this)
        txtNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.txtNumber || v?.id == R.id.btnRandom) {
            txtNumber.text = random().toString();
        }
    }

    fun random() : Int
    {
        return Random.nextInt(until = 50) + 1
    }
}
