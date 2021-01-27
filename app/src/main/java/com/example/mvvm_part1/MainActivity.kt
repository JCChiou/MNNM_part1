package com.example.mvvm_part1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvm_part1.viewModel.MainViewModel
import com.example.mvvm_part1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding
    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.viewModel = viewModel
        binding.btnRefresh.setOnClickListener { viewModel.refresh() }


    }
}