package com.example.nguyenxuansang98.broadcastandasynctask

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class GetData : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.e("NAME_ACTION",""+intent!!.action.toString())
    }
}