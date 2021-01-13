package com.example.databinding

import android.content.Context
import android.widget.Toast

open class EventHandler (context:Context)
{
val  myContext:Context=context

    fun onButtonClick()
    {
        Toast.makeText(myContext,"hello",Toast.LENGTH_LONG).show();
    }
}