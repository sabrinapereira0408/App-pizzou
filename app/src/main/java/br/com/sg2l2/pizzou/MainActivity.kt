package br.com.sg2l2.pizzou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoUsuario.setText(Prefs.getString("lembrarNome"))
        campoSenha.setText(Prefs.getString("lembrarSenha"))
        checkBox.isChecked = Prefs.getBoolean("lembrar")


        Prefs.setString("professor", "Guilherme")
        Prefs.setBoolean("Mobile", true )
        Prefs.setString("dia", "terça")

        botaozinho.setOnClickListener {
            val valorUsuario = campoUsuario.text.toString()
            val valorSenha = campoSenha.text.toString()

            Prefs.setBoolean("lembrar", checkBox.isChecked)

            if (checkBox.isChecked) {
                Prefs.setString("lembrarNome", valorUsuario)
                Prefs.setString("lembrarSenha", valorSenha)
            } else {
                Prefs.setString("lembrarNome", "")
                Prefs.setString("lembrarSenha", "")
            }

            if (valorUsuario.equals("aluno") && valorSenha.equals("impacta")) {
                var intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_LONG).show()

                //val intent: Intent = Intent(this, Activity2::class.java)
                //startActivity(intent)
            }
        }
    }
}