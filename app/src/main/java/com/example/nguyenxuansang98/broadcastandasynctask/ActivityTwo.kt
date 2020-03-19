package com.example.nguyenxuansang98.broadcastandasynctask

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class ActivityTwo : AppCompatActivity() {
    var br :BroadcastReceiver ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
         br = object : BroadcastReceiver(){
            override fun onReceive(context: Context?, intent: Intent?) {
                val nameAction = intent!!.getStringExtra("XS")
                Toast.makeText(context,""+nameAction,Toast.LENGTH_SHORT).show()
                Log.d("Ten Action : ",""+nameAction)
            }
        }
        registerReceiver(br, IntentFilter("XuanSang"))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(br)
    }
}
