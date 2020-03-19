package com.example.nguyenxuansang98.broadcastandasynctask

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import kotlinx.android.synthetic.main.activity_main.btn_send


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_send.setOnClickListener {
            val intent = Intent()
            intent.setClass(this,ActivityTwo::class.java)
            intent.setAction("XuanSang")
            intent.putExtra("XS","xxx")
            sendBroadcast(intent)
            startActivity(intent)
        }
    }
}
