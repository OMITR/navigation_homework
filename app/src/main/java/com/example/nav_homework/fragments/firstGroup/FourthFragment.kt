package com.example.nav_homework.fragments.firstGroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_homework.R

class FourthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fourth_fragment, container, false)
        val button11 = view.findViewById<Button>(R.id.button11)

        button11.setOnClickListener {
            findNavController().navigate(
                R.id.action_fourthFragment_to_firstFragment
            )
        }

        return view
    }
}