package edu.temple.fragmentrefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val greetingFragment = GreetingFragment()

            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainerView, greetingFragment)
                .commit()
        }
    }
}