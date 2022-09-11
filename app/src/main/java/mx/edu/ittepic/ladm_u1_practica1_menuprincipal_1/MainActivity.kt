package mx.edu.ittepic.ladm_u1_practica1_menuprincipal_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mx.edu.ittepic.ladm_u1_practica1_menuprincipal_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lista.setOnClickListener {
            //El activity 2 lo guardamos en una variable
            var otroActivity = Intent(this, MainActivity2::class.java)
            startActivity(otroActivity) //Activar
        }

        binding.agregar.setOnClickListener {
            //Mandar mensaje de que se guardo
            Toast.makeText(this, "Se agrego el producto", Toast.LENGTH_LONG)
                .show()
        }
    }
}