package com.example.example;

import com.example.aidl.IMyService;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    private MyBinder myBinder;

	@Override
    public void onCreate() {
    	// TODO Auto-generated method stub
    	super.onCreate();
    	myBinder = new MyBinder();
    }
	
    class MyBinder extends IMyService.Stub
    {
    	public String getdata() 
    	{
    		
    		return MyService.this.getdata();
    	}
    }
    
    private String getdata() {
		return "data from Myservice";
    //	Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
		// TODO Auto-generated method stub

	}
    @Override
	public IBinder onBind(Intent intent) {
		// TODO: Return the communication channel to the service.
		return myBinder;
	}
}
