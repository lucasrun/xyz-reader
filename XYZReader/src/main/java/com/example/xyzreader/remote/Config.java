package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    public static final String URL = "https://go.udacity.com/xyz-reader-json";

    static {
        URL url = null;
        try {
            url = new URL(URL );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BASE_URL = url;
    }
}
