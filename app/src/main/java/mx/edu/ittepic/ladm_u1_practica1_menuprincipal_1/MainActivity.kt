package mx.edu.ittepic.ladm_u1_practica1_menuprincipal_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import mx.edu.ittepic.ladm_u1_practica1_menuprincipal_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var suma = 0

        binding.lista.setOnClickListener {
            //El activity 2 lo guardamos en una variable
            var otroActivity = Intent(this, MainActivity2::class.java)
            startActivity(otroActivity) //Activar
        }

        binding.agregar.setOnClickListener {
            //Mandar mensaje de que se guardo
            Toast.makeText(this, "Por el momento no se puede agregar un producto", Toast.LENGTH_LONG)
                .show()

            //borrarCampos()
        }

        binding.eliminar.setOnClickListener {
            //Alertar que se va a eliminar
            //var n_producto = producto.text.toString()

            AlertDialog.Builder(this)
                .setTitle("Importante")
                .setMessage("¿Deseas eliminar un producto?")
                .setPositiveButton("Aceptar"){ d, i->
                    d.dismiss()
                    Toast.makeText(this, "No cuentas con productos para eliminar", Toast.LENGTH_LONG)
                    //borrarCampos()
                }

                .setNegativeButton("Cancelar"){d, i->
                    d.cancel()
                    Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT)
                }

                .show()
        }

        binding.salir.setOnClickListener {
            finish()
        }

        binding.vertotal.setOnClickListener {
            var Activity3 = Intent(this, MainActivity3::class.java)
            startActivity(Activity3)
        }


    }

    /*fun borrarCampos(){
        producto.setText("")
        cantidad.setText("")
        precio.setText("")
    }*/
}