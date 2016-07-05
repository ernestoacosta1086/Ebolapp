package com.ahorcado.ernes.ebolapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by ernes on 7/5/2016.
 */
public class MyAplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kajaiZCg8Ri08zRMFDx4pAOs5ZsNbeI3boVV730M")
                .clientKey("n7BTnvUoffFmmW6ZQnrm4g95B0SNd9VIGyo8nvFp")
                .server("https://parseapi.back4app.com").build()
        );

        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
