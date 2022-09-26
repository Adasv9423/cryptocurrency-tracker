package com.example.crypto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.example.crypto.databinding.FragmentHomeBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(layoutInflater)
//        getTopCurrencyList()
        return binding.root
    }

//    private fun getTopCurrencyList() {
//        lifecycleScope.launch(Dispatchers.IO){
//            val res=Apiutilities.getInstance().create(Apiinterface::class.java)
//        }
//    }


}