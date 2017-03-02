package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 02/03/2017.
 */

public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperture temperture;

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

    public class Temperture {

        public String max;

        public String min;

    }
}
