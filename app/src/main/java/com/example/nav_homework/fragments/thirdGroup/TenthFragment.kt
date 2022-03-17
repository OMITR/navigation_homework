package com.example.nav_homework.fragments.thirdGroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_homework.R

class TenthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.tenth_fragment, container, false)
        val button15 = view.findViewById<Button>(R.id.button15)

        button15.setOnClickListener {
            findNavController().navigate(
                R.id.action_tenthFragment_to_firstFragment
            )
        }

        return view
    }
}