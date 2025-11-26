package com.example.lifecycle

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

class LifecycleActivity(override val lifecycle: Lifecycle) : Activity(), LifecycleOwner{
    private val lifecycleRegistry = LifecycleRegistry(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       lifecycleRegistry.currentState = Lifecycle.State.CREATED
    }

    override fun onResume() {
        super.onResume()
        lifecycleRegistry.currentState = Lifecycle.State.RESUMED
    }

    override fun onDestroy(){
        super.onDestroy()
        lifecycleRegistry.currentState = Lifecycle.State.DESTROYED
    }
}