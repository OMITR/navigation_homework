package com.example.nav_homework.fragments.secondGroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_homework.R

class FifthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fifth_fragment, container, false)
        val button6 = view.findViewById<Button>(R.id.button6)
        val button7 = view.findViewById<Button>(R.id.button7)

        button6.setOnClickListener {
            findNavController().navigate(
                R.id.action_fifthFragment_to_sixthFragment
            )
        }
        button7.setOnClickListener {
            findNavController().navigate(
                R.id.action_fifthFragment_to_seventhFragment
            )
        }

        return view
    }
}