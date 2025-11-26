package com.example.lifecycle.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lifecycle.domain.CounterRepository

class CounterRepositoryImpl : CounterRepository {
    private val _counter = MutableLiveData(0)

    override fun getCounter(): LiveData<Int> = _counter

    override fun incrementCounterBy(increment: Int){
        val number= _counter.value ?: 0
        _counter.value = number + increment
    }
}