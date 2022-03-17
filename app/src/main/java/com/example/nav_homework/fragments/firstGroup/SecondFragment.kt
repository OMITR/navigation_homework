package com.example.nav_homework.fragments.firstGroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_homework.R

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.second_fragment, container, false)
        val button4 = view.findViewById<Button>(R.id.button4)
        val button5 = view.findViewById<Button>(R.id.button5)

        button4.setOnClickListener {
            findNavController().navigate(
                R.id.action_secondFragment_to_thirdFragment
            )
        }
        button5.setOnClickListener {
            findNavController().navigate(
                R.id.action_secondFragment_to_fourthFragment
            )
        }

        return view
    }
}