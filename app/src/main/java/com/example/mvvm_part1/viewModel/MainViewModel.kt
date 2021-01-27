package com.example.mvvm_part1.viewModel

import androidx.databinding.ObservableField
import com.example.mvvm_part1.dataModel.DataModel




open class MainViewModel {

    private val dataModel = DataModel()
    var mDate = ObservableField<String>()
    var isLoading = ObservableField<Boolean>(false)

    open fun refresh(){
        isLoading.set(true)
        mDate.set("")
        dataModel.retrieveData(object: DataModel.OnDataReadyCallback{
            override fun onDataReady(data: String) {
                mDate.set(data)
                isLoading.set(false)
            }

        })
    }
}