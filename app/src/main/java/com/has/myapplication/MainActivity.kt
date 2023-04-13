package com.has.myapplication


import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val verficar: Button = findViewById<Button>(R.id.verificar)
        verficar.setOnClickListener{
            signos()
        }
    }

    private fun signos() {
        val mesEditText: EditText = findViewById(R.id.mesaniver)
        val diaEditText: EditText = findViewById(R.id.diaaniver)

        val mes: String = mesEditText.text.toString()
        val dia: Int = diaEditText.text.toString().toInt()
        val verficar: Button = findViewById<Button>(R.id.verificar)
        val imagem: ImageView = findViewById(R.id.perfil)

        val mes_numero = when (mes.toLowerCase()) {
            "janeiro" -> 1
            "fevereiro" -> 2
            "março" -> 3
            "abril" -> 4
            "maio" -> 5
            "junho" -> 6
            "julho" -> 7
            "agosto" -> 8
            "setembro" -> 9
            "outubro" -> 10
            "novembro" -> 11
            "dezembro" -> 12
            else -> 0
        }



        if ((dia >= 21 && mes_numero == 3) || (dia <= 20 && mes_numero == 4)) {                      // Áries: 21 de março a 20 de abril
            val toast = Toast.makeText(this, "Seu signo é Áries!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.aries)
        } else if ((dia >= 21 && mes_numero == 4) || (dia <= 20 && mes_numero == 5)) {               // Touro: 21 de abril a 20 de maio
            val toast = Toast.makeText(this, "Seu signo é Touro!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.taurus)
        } else if ((dia >= 21 && mes_numero == 5) || (dia <= 20 && mes_numero == 6)) {               // Gêmeos: 21 de maio a 20 de junho
            val toast = Toast.makeText(this, "Seu signo é Gêmeos!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.gemini)
        } else if ((dia >= 21 && mes_numero == 6) || (dia <= 22 && mes_numero == 7)) {              // Câncer: 21 de junho a 22 de julho
            val toast = Toast.makeText(this, "Seu signo é Câncer!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.cancer)
        } else if ((dia >= 23 && mes_numero == 7) || (dia <= 22 && mes_numero == 8)) {              // Leão: 23 de julho a 22 de agosto
            val toast = Toast.makeText(this, "Seu signo é Leão!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.leo)
        } else if ((dia >= 23 && mes_numero == 8) || (dia <= 22 && mes_numero == 9)) {              // Virgem: 23 de agosto a 22 de setembro
            val toast = Toast.makeText(this, "Seu signo é virgem!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.virgo)
        } else if ((dia >= 23 && mes_numero == 9) || (dia <= 22 && mes_numero == 10)) {             // Libra: 23 de setembro a 22 de outubro
            val toast = Toast.makeText(this, "Seu signo é Libra!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.libra)
        } else if ((dia >= 23 && mes_numero == 10) || (dia <= 21 && mes_numero == 11)) {            // Escorpião: 23 de outubro a 21 de novembro
            val toast =
                Toast.makeText(this, "Seu signo é Escorpião!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.scorpio)
        } else if ((dia >= 22 && mes_numero == 11) || (dia <= 21 && mes_numero == 12)) {            // Sagitário: 22 de novembro a 21 de dezembro
            val toast =
                Toast.makeText(this, "Seu signo é Sagitário!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.sagittarius)
        } else if ((dia >= 22 && mes_numero == 12) || (dia <= 20 && mes_numero == 1)) {             // Capricórnio: 22 de dezembro a 20 de janeiro
            val toast =
                Toast.makeText(this, "Seu signo é Capricórnio!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.capricorn)
        } else if ((dia >= 21 && mes_numero == 1) || (dia <= 19 && mes_numero == 2)) {              // Aquário: 21 de janeiro a 19 de fevereiro
            val toast = Toast.makeText(this, "Seu signo é Aquário!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.aquarius)
        } else if ((dia >= 20 && mes_numero == 2) || (dia <= 20 && mes_numero == 3)) {              // Peixes: 20 de fevereiro a 20 de março
            val toast = Toast.makeText(this, "Seu signo é Peixes!", Toast.LENGTH_SHORT).show()
            imagem.setImageResource(R.drawable.pisces)
        } else {
            val toast =
                Toast.makeText(this, "Data de nascimento invalida!", Toast.LENGTH_SHORT).show()
        }
    }

}
