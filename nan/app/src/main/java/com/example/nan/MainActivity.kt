package com.example.nan

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.ImageView
import android.widget.PopupWindow
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var container1: ImageView
    lateinit var container2: ImageView
    lateinit var currentContainer: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val info = findViewById<ImageButton>(R.id.info)
        info.setOnClickListener {
            Toast.makeText(this, "Instructions", Toast.LENGTH_SHORT).show()
            val inflater = layoutInflater
            val view = inflater.inflate(R.layout.activity_popup, null)
            val window = PopupWindow(view, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, true)
            window.showAtLocation(view, Gravity.CENTER, 0,0)
        }

        container1 = findViewById(R.id.container_1)
        container2 = findViewById(R.id.container_2)
        // Create references for all 12 zodiac sign buttons
        val ariesButton: ImageButton = findViewById(R.id.ariesButton)
        val taurusButton: ImageButton = findViewById(R.id.taurusButton)
        val geminiButton: ImageButton = findViewById(R.id.geminiButton)
        val cancerButton: ImageButton = findViewById(R.id.cancerButton)
        val leoButton: ImageButton = findViewById(R.id.leoButton)
        val virgoButton: ImageButton = findViewById(R.id.virgoButton)
        val libraButton: ImageButton = findViewById(R.id.libraButton)
        val scorpioButton: ImageButton = findViewById(R.id.scorpioButton)
        val sagittariusButton: ImageButton = findViewById(R.id.sagittariusButton)
        val capricornButton: ImageButton = findViewById(R.id.capricornButton)
        val aquariusButton: ImageButton = findViewById(R.id.aquariusButton)
        val piscesButton: ImageButton = findViewById(R.id.piscesButton)

        val confirmButton: Button = findViewById(R.id.confirm)

        // Start with container1 as the current container
        currentContainer = container1

        // Set onClickListener for Aries button
        ariesButton.setOnClickListener {
            currentContainer.tag = ariesButton.tag
            currentContainer.setImageResource(R.drawable.aries)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Taurus button
        taurusButton.setOnClickListener {
            currentContainer.tag = taurusButton.tag
            currentContainer.setImageResource(R.drawable.taurus)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Gemini button
        geminiButton.setOnClickListener {
            currentContainer.tag = geminiButton.tag
            currentContainer.setImageResource(R.drawable.gemini)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Cancer button
        cancerButton.setOnClickListener {
            currentContainer.tag = cancerButton.tag
            currentContainer.setImageResource(R.drawable.cancer)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Leo button
        leoButton.setOnClickListener {
            currentContainer.tag = leoButton.tag
            currentContainer.setImageResource(R.drawable.leo)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Virgo button
        virgoButton.setOnClickListener {
            currentContainer.tag = virgoButton.tag
            currentContainer.setImageResource(R.drawable.virgo)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Libra button
        libraButton.setOnClickListener {
            currentContainer.tag = libraButton.tag
            currentContainer.setImageResource(R.drawable.libra)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Scorpio button
        scorpioButton.setOnClickListener {
            currentContainer.tag = scorpioButton.tag
            currentContainer.setImageResource(R.drawable.scorpio)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Sagittarius button
        sagittariusButton.setOnClickListener {
            currentContainer.tag = sagittariusButton.tag
            currentContainer.setImageResource(R.drawable.sagittarius)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Capricorn button
        capricornButton.setOnClickListener {
            currentContainer.tag = capricornButton.tag
            currentContainer.setImageResource(R.drawable.capricorn)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Aquarius button
        aquariusButton.setOnClickListener {
            currentContainer.tag = aquariusButton.tag
            currentContainer.setImageResource(R.drawable.aquarius)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }

// Set onClickListener for Pisces button
        piscesButton.setOnClickListener {
            currentContainer.tag = piscesButton.tag
            currentContainer.setImageResource(R.drawable.pisces)
            if (currentContainer == container1) {
                currentContainer = container2
            } else {
                currentContainer = container1
            }
        }







        confirmButton.setOnClickListener {
            checkCompatibility()
        }

    }
    private fun checkCompatibility() {

        val sign1 = container1.tag.toString()
        val sign2 = container2.tag.toString()
        Log.d("Compatibility", "Sign 1: $sign1, Sign 2: $sign2")

        // Make sure that sign1 and sign2 have the expected values
        Log.d("Compatibility", "Sign 1: ${container1.tag}, Sign 2: ${container2.tag}")
        // Check compatibility based on the zodiac signs in container1 and container2
        val compatibility = getCompatibility(container1.tag.toString(), container2.tag.toString())

        // Show the compatibility result in a pop-up
        val inflater = LayoutInflater.from(this)
        val view = inflater.inflate(R.layout.activity_result, null)
        val window = PopupWindow(view, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, true)
        window.showAtLocation(view, Gravity.CENTER, 0,0)

        // Update the text in the pop-up based on compatibility
        val compatibilityText = view.findViewById<TextView>(R.id.compatibilityText)
        compatibilityText.text = compatibility

        val closeButton = view.findViewById<ImageButton>(R.id.closeButton)
        closeButton.setOnClickListener {
            window.dismiss()
            restartApp()
        }
    }

    private fun restartApp() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }

    private fun getCompatibility(sign1: String, sign2: String): String {
        // List of compatible zodiac signs
        val compatibleSigns = mapOf(
            "Aries" to listOf("Leo", "Sagittarius"),
            "Taurus" to listOf("Virgo", "Capricorn"),
            "Gemini" to listOf("Libra", "Aquarius"),
            "Cancer" to listOf("Scorpio", "Pisces"),
            "Leo" to listOf("Sagittarius", "Aries"),
            "Virgo" to listOf("Taurus", "Capricorn"),
            "Libra" to listOf("Gemini", "Aquarius"),
            "Scorpio" to listOf("Cancer", "Pisces"),
            "Sagittarius" to listOf("Aries", "Leo"),
            "Capricorn" to listOf("Taurus", "Virgo"),
            "Aquarius" to listOf("Gemini", "Libra"),
            "Pisces" to listOf("Cancer", "Scorpio")
        )

// List of not compatible zodiac signs
        val notCompatibleSigns = mapOf(
            "Aries" to listOf("Cancer", "Capricorn"),
            "Taurus" to listOf("Leo", "Aquarius"),
            "Gemini" to listOf("Virgo", "Pisces"),
            "Cancer" to listOf("Aries", "Libra"),
            "Leo" to listOf("Taurus", "Scorpio"),
            "Virgo" to listOf("Gemini", "Sagittarius"),
            "Libra" to listOf("Cancer", "Capricorn"),
            "Scorpio" to listOf("Leo", "Aquarius"),
            "Sagittarius" to listOf("Virgo", "Pisces"),
            "Capricorn" to listOf("Aries", "Libra"),
            "Aquarius" to listOf("Taurus", "Scorpio"),
            "Pisces" to listOf("Gemini", "Sagittarius")
        )

        // Check compatibility based on the lists
        if (compatibleSigns[sign1]?.contains(sign2) == true || compatibleSigns[sign2]?.contains(sign1) == true) {
            return "Compatible!"
        } else if (notCompatibleSigns[sign1]?.contains(sign2) == true || notCompatibleSigns[sign2]?.contains(sign1) == true) {
            return "Not Compatible!"
        } else {
            // Check if the signs are not found in either compatible or not compatible lists
            return "Neutral" // Handle unknown compatibility
        }
    }

}

