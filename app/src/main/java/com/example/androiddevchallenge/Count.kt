package com.example.androiddevchallenge

import android.content.Context

object Count {
    lateinit var appContext: Context
    fun provider(context: Context){
        appContext=context
    }
}