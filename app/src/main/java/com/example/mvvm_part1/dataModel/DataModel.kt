package com.example.mvvm_part1.dataModel

import android.os.Handler
import android.os.Looper


class DataModel {

    fun retrieveData(callback: OnDataReadyCallback) {
        Handler(Looper.getMainLooper()).postDelayed({
            callback.onDataReady("New Data")
        }
        ,1500)
//        Handler().postDelayed(Runnable { callback.onDataReady("New Data") }, 1500)
    }

    interface OnDataReadyCallback{
        fun onDataReady(data: String)
    }
}
