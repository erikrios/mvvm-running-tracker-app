package com.erikriosetiawan.mvvmrunningtrackerapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.erikriosetiawan.mvvmrunningtrackerapp.R
import com.erikriosetiawan.mvvmrunningtrackerapp.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}