package uz.gita.luis.animalsounds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.gita.luis.animalsounds.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.container, MainFragment()).commit()

    }
}