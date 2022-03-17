package com.example.nav_homework.fragments.thirdGroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_homework.R

class EighthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.eighth_fragment, container, false)
        val button8 = view.findViewById<Button>(R.id.button8)
        val button9 = view.findViewById<Button>(R.id.button9)

        button8.setOnClickListener {
            findNavController().navigate(
                R.id.action_eighthFragment_to_ninthFragment
            )
        }
        button9.setOnClickListener {
            findNavController().navigate(
                R.id.action_eighthFragment_to_tenthFragment
            )
        }

        return view
    }
}