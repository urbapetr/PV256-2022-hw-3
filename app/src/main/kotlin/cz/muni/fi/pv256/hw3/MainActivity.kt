package cz.muni.fi.pv256.hw3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private var count by Delegates.notNull<Int>()
    private val COUNT_KEY = "COUNT_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO 2. initialise TextView and Buttons as local values
        val decrement = findViewById<Button>(R.id.decrement)
        val increment = findViewById<Button>(R.id.increment)
        val textView = findViewById<TextView>(R.id.counter)

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(COUNT_KEY)
        } else {
            count = 0
        }
        textView.text = count.toString()

        // TODO 3. Implement counter using TextView and the field `count`
        decrement.setOnClickListener {
            count--
            textView.text = count.toString()
        }
        increment.setOnClickListener {
            count++
            textView.text = count.toString()
        }
    }

    // TODO 4. Make sure the counter survives orientation changes (its value won't reset or change on screen rotation)
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(COUNT_KEY, count)
    }
}
