package com.cead.androiddiez.Activities

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.cead.androiddiez.Fragments.DataFragment
import com.cead.androiddiez.Fragments.DetailsFragment
import com.cead.androiddiez.R

class MainActivity : FragmentActivity(), DataFragment.DataListener{


    /*
        alt + enter = borra os imports que no necesitamos
        FRAGMENTS:  REPRESENTA UNA PARTE DE LA INTERFAZ DE USUARIO EN UNN ACTIVITY, SE PUEDEN USAR VARIOS FRGAMENTOS EN UNA ACTIVIDAD
        el activity se comunicarian con los fragmetnos

        para crear un layout pero diferente tamaño
         es click derecho en res -> new layout resource file  le ponemos el mismo nombre del layout y elegimos los parametros

     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun sendData(text: String?) {
                //llamar al metodo renderizarTexto del DetailsFragment,
                //pasando el texto que recibimos por parametro en este mismo metodo
        var detailsFragment: DetailsFragment = supportFragmentManager.findFragmentById(R.id.detailsFragment) as DetailsFragment
        detailsFragment.renderText(text!!)


    }
}
