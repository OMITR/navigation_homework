package com.example.nav_homework.fragments.secondGroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_homework.R

class SeventhFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.seventh_fragment, container, false)
        val button13 = view.findViewById<Button>(R.id.button13)

        button13.setOnClickListener {
            findNavController().navigate(
                R.id.action_seventhFragment_to_firstFragment
            )
        }

        return view
    }
}