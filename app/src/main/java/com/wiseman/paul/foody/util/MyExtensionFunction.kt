package com.wiseman.paul.foody.util

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T> LiveData<T>.observerOnce(lifecyclerOwner: LifecycleOwner, observer: Observer<T>){
    observe(lifecyclerOwner, object : Observer<T>{
        override fun onChanged(t: T) {
            removeObserver(this)
            observer.onChanged(t)
        }

    })
}