package com.erikriosetiawan.mvvmrunningtrackerapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.erikriosetiawan.mvvmrunningtrackerapp.R
import com.erikriosetiawan.mvvmrunningtrackerapp.ui.viewmodels.MainViewModel

class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}