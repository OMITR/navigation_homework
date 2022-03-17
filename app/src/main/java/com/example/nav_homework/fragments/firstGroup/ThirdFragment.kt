package com.example.nav_homework.fragments.firstGroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_homework.R

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.third_fragment, container, false)
        val button10 = view.findViewById<Button>(R.id.button10)

        button10.setOnClickListener {
            findNavController().navigate(
                R.id.action_thirdFragment_to_firstFragment
            )
        }

        return view
    }
}