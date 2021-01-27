package mx.tecnm.tepic.tap_u5_ejercicio2_menuestructurascontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button6.setOnClickListener {
            var opcionSponer = spinner.selectedItemPosition
            when (opcionSponer) {
                0 -> {
                    var cadena1 = "919"
                    var valorEntero = cadena1.toInt()
                    valorEntero += 1;
                    editTextTextResultado.setText("Conversion CAD a INT: ${valorEntero}")
                }
                1 -> {
                    var cadena2 = "5.18"
                    var valorDoble = cadena2.toDouble()
                    valorDoble += 0.92
                    editTextTextResultado.setText("Conversion CAD a DOUBLE: ${valorDoble}")

                }
                2 -> {
                    var decima2 = 29.18
                    var cadena3 = decima2.toString()
                    cadena3 = "Conversion DEC A CAD: " + cadena3;
                    editTextTextResultado.setText(cadena3)

                }
                3 -> {
                    var entero = 915
                    var cadena4 = "Conversion INT A CAD: "+entero
                    editTextTextResultado.setText(cadena4)
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuconversion, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.regresar -> {
                finish()
            }
            R.id.limpiar -> {
                editTextTextResultado.setText("")
                Toast.makeText(this, "Se limpio campo de texto", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}