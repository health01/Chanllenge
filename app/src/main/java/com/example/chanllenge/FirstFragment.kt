package com.example.chanllenge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        val testList = arrayListOf<Int>(5, 17, 33, 41, 55, 61, 80)
        val find = 55

        testList.binarySearch(55).let {
            println("test" + it.toString())
        }


    }

    fun findSingle(ar: IntArray, ar_size: Int): Int {
        // Do XOR of all elements and return
        var res = ar[0]
        for (i in 1 until ar_size) res = res xor ar[i]
        return res
    }
}