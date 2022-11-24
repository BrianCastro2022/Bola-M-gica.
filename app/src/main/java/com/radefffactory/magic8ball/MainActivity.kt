package com.radefffactory.magic8ball

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var tv_text: TextView

    val phrases = arrayOf(
            "Es cierto",
            "Esta decidido",
            "Sin duda",
            "Si, definitivamente",
            "Puedes confiar en ello",
            "Por lo que veo si",
            "Es lo mas probable",
            "Se mira bien",
            "Si",
            "Todo apunta a que si",
            "Respuesta confusa, intenta otra vez",
            "Pregunta denuevo mas tarde",
            "Mejor no te lo digo ahora",
            "No puedo predecirlo",
            "Concentrate y pregunta de nuevo",
            "No cuentes con ello",
            "Mi respuesta es no",
            "Mis fuentes dicen que no",
            "El panorama no apunta a tu favor",
            "Muy dudoso"
    )

    lateinit var random: Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        random = Random

        tv_text = findViewById(R.id.tv_text);

        tv_text.setOnClickListener {
            tv_text.text = phrases[random.nextInt(phrases.size)]
        }
    }
}