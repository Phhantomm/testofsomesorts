package com.example.testofsomesorts.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.testofsomesorts.R

class Sidehoe:Fragment(R.layout.sidehoe_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textView).text = SidehoeArgs.fromBundle(requireArguments()).name
    }
}