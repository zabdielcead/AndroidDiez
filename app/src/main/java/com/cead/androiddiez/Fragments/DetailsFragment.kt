package com.cead.androiddiez.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.cead.androiddiez.R



class DetailsFragment : Fragment() {



    var details : TextView ? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var view: View = inflater.inflate(R.layout.fragment_details, container, false)

        details = view.findViewById(R.id.txtViewDetails)
        return view
    }

     fun renderText(text : String){
        details!!.text = text
    }


}
