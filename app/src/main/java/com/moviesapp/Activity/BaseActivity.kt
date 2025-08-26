package com.moviesapp.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // PERMITE QUE LA INTERFAZ OCUPE EL ESPACIO DISPONIBLE
        // INCLUSO DETRÁS DE LA statusbar Y LA navigationbar
        // LAS DEMÁS CLASES HEREDAN DE ELLA, CON LO CUAL HAY
        // QUE LLAMAR AL BaseActivity EN CADA CLASE QUE LO
        // QUERAMOS APLICAR

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )

        // ESTA ES OTRA FORMA MODERNA DE HACERLO, EN VEZ DE FLAG...
        // AUNQUE HAY QUE VIGILAR LOS PADDING
        // WindowCompat.setDecorFitsSystemWindows(window, false)

    }
}