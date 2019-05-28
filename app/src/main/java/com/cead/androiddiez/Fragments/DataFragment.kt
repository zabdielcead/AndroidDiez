package com.cead.androiddiez.Fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

import com.cead.androiddiez.R
import java.lang.ClassCastException
import java.lang.Exception


/**
 * A simple [Fragment] subclass.
 *
 */
class DataFragment : Fragment() {

    var textData: EditText ? = null
    var btnSend: Button ? = null
    var callback: DataListener ? = null

    override fun onAttach(context: Context?) {   //comunicacion fragmen con el activity
        super.onAttach(context)
        try {
             callback = context!! as DataListener
        }catch (e: Exception){
            throw ClassCastException(context.toString() + " should implement DataListener")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var view: View =  inflater.inflate(R.layout.fragment_data, container,false)
        // logica para capturar los elementos de la UI
        textData = view.findViewById(R.id.editTextData)
        btnSend = view.findViewById(R.id.btnSendData)

        btnSend!!.setOnClickListener{
                    sendText(textData!!.text.toString())
        }

        return view
    }

    private fun sendText(text: String){
            callback!!.sendData(text)
    }

    interface DataListener {
        fun sendData(text: String?)
    }


}
