package com.viaweather.android.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Callback;

/**
 * Created by eightstreets on 2017/4/20.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
