package com.example.myfirstapplication9.contact

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myfirstapplication9.R
import com.example.myfirstapplication9.data.ConDatabase
import com.example.myfirstapplication9.databinding.FragmentContactfragmentBinding


class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentContactfragmentBinding =
            DataBindingUtil.inflate(inflater,R.layout.fragment_contactfragment,container,false)
        val  application = requireNotNull(this.activity).application

        val dataSource = ConDatabase.getInstance(application).conDatabaseDao

        val viewModelFactory = ConViewModelFactory(dataSource,application)

        val  conViewModel = ViewModelProvider(this,viewModelFactory).get(ConViewModel::class.java)

        binding.setLifecycleOwner(this)
        binding.conViewModel = conViewModel

        return binding.root
    }


}