package br.com.sg2l2.pizzou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.navigation_menu.*
import kotlinx.android.synthetic.main.toolbar.*

open class DebugActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val TAG = "LMSApp"
    private val className: String
        get() {
            val s = javaClass.name
            return s.substring(s.lastIndexOf("."))
        }

    var generic_layout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, className + ".onCreate() chamado")
    }

    protected fun configuraMenuLateral() {
        var toogle = ActionBarDrawerToggle(
            this,
            generic_layout,
            toolbar_view,
            R.string.nav_abrir,
            R.string.nav_fechar
        )
        generic_layout?.addDrawerListener(toogle)
        toogle.syncState()

        menu_lateral.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.nav_promocao -> {
                val intent = Intent(this, MenuActivity::class.java)
                Toast.makeText(this, "Menu Promoções", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }

            R.id.nav_cardapio -> {
                val intent = Intent(this, CardapioActivity::class.java)
                Toast.makeText(this, "Menu Cardápio", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }

            R.id.nav_configuracoes -> {
                val intent = Intent(this, ConfigActivity::class.java)
                Toast.makeText(this, "Menu Configurações", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }

            R.id.nav_sair -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        generic_layout?.closeDrawer(GravityCompat.START)

        return true
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, className + ".onStart() chamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, className + ".onRestart() chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, className + ".onResume() chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, className + ".onPause() chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, className + ".onStop() chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, className + ".onDestroy() chamado")
    }


}