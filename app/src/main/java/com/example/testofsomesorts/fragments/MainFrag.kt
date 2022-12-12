package com.example.testofsomesorts.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.testofsomesorts.R

class MainFrag: Fragment(R.layout.main_layout) {
    private lateinit var button: Button
    private lateinit var editText: EditText
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button = view.findViewById(R.id.button)
        editText = view.findViewById(R.id.editTextTextPersonName)
        button.setOnClickListener {
            val name = editText.text.toString()
            val action = MainFragDirections.actionMainFragToSidehoe(name)
            findNavController().navigate(action)
        }

    }
}