package com.example.myspecial.mysearvices

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlin.concurrent.thread


class LoggerService : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.i("amarnathbaitha","OnCreate Method")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("amarnathbaitha","onStartCommand Method")
        //Every one second this code will execute
        // When we close the app this service will continue to run but when we close the app then this service will stop. But earlier this service was continue to work even you have close the app.
        thread (start = true){
         while (true){
             Log.i("amarnathbaitha","Logging")
             Thread.sleep(1000)
         }
        }
        //To stop the service based on the below code
        //stopService(intent)
        return super.onStartCommand(intent, flags, startId)

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("amarnathbaitha","onDestroy Method")
    }
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
        Log.i("amarnathbaitha","onBind Method")
        return  null
    }
}