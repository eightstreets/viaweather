package com.viaweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by eightstreets on 2017/4/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
