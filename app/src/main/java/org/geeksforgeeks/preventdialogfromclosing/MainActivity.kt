package org.geeksforgeeks.preventdialogfromclosing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initializing a Builder for the Alert Dialog
        val mBuilder = AlertDialog.Builder(this)
            .setTitle("TITLE")
            .setMessage("MESSAGE")
            .setPositiveButton("Positive", null)
            .setNegativeButton("Negative", null)
            .show()

        // Changing Positive Button properties such that something happens on click
        val mPositiveButton = mBuilder.getButton(AlertDialog.BUTTON_POSITIVE)
        mPositiveButton.setOnClickListener {
            // Do something
            // As we do not want the Alert Dialog to close, we will only display a Toast and do nothing else.
            Toast.makeText(this, "Can't Exit", Toast.LENGTH_SHORT).show()
        }

    }
}