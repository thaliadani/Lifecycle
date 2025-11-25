package com.example.lifecycle

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

class LifecycleActivity : Activity(), LifecycleOwner{
    override val lifecycle: Lifecycle{
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle
    }

    override fun getLifecycle() : Lifecycle {
        TODO("Not yet implemented")
    }

}