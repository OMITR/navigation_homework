package com.example.nav_homework.fragments.secondGroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_homework.R

class SixthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.sixth_fragment, container, false)
        val button12 = view.findViewById<Button>(R.id.button12)

        button12.setOnClickListener {
            findNavController().navigate(
                R.id.action_sixthFragment_to_firstFragment
            )
        }

        return view
    }
}