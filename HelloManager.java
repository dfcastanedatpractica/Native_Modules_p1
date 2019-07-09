package com.rn4;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class HelloManager extends ReactContextBaseJavaModule{
    public HelloManager(ReactApplicationContext reactContext){
        super(reactContext);
    }

    @Override
    public String getName(){
        return "HelloManager";
    }

    @ReactMethod
    public void greetUser(String name, Boolean isAdmin, Callback callback){
        System.out.println("UserName: " + name + ", you " + (isAdmin ? "Yes" : "No"));
        String greeting = "Welcome " + name + ", you " + (isAdmin ? "are " : "aren't ") + "ADMIN";
        callback.invoke(greeting);
    }

}