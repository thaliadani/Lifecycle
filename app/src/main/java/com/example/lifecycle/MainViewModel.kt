package com.example.lifecycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _counter = MutableLiveData(0)
    val  counter: LiveData<Int> = _counter

    fun incrementCounter() {
        val number= _counter.value ?: 0
        _counter.value = number + 1
    }
}
