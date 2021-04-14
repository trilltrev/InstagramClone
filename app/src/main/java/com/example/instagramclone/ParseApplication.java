package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4F8yOFfqIu8JDCeNLYi5MUWqEBghdgdzGa7E0Ptu")
                .clientKey("rwQfzqIDM0R6QNxWuOz4HyDcttdkiCOUvRBEvtk9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
