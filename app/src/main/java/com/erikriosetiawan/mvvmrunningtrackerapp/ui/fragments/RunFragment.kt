package com.erikriosetiawan.mvvmrunningtrackerapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.erikriosetiawan.mvvmrunningtrackerapp.R
import com.erikriosetiawan.mvvmrunningtrackerapp.ui.viewmodels.MainViewModel

class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewModels()
}