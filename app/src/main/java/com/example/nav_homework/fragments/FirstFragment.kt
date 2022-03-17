package com.example.nav_homework.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_homework.R

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.first_fragment, container, false)
        val button = view.findViewById<Button>(R.id.button)
        val button2 = view.findViewById<Button>(R.id.button2)
        val button3 = view.findViewById<Button>(R.id.button3)

        button.setOnClickListener {
            findNavController().navigate(
                R.id.action_firstFragment_to_secondFragment
            )
        }
        button2.setOnClickListener {
            findNavController().navigate(
                R.id.action_firstFragment_to_fifthFragment
            )
        }
        button3.setOnClickListener {
            findNavController().navigate(
                R.id.action_firstFragment_to_eighthFragment
            )
        }

        return view
    }
}