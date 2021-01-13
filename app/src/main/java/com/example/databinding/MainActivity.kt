package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Creating a data binding layout
        val binding:ActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
//        binding.tvEmail.text="manuchangole@gmail.com"; //add email to tvEmail using data binding
//        binding.tvName.text="Changole"

        binding.contact= Contact("Changole","manuchangol2e@gmail.com")
        binding.handler= EventHandler(this);
        binding.imageUrl="https://i.redd.it/lhw4vp5yoy121.jpg"
    }
}