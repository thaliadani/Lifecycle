package com.example.lifecycle.presentation.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lifecycle.domain.CounterRepository

class MainViewModel (
    private val repository : CounterRepository,
): ViewModel() {
    val  counter: LiveData<Int> = repository.getCounter()

    var incrementBy = 1

    fun incrementCounter() {
        repository.incrementCounterBy(incrementBy)
    }
}


