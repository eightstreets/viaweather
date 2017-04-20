package com.viaweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by eightstreets on 2017/4/20.
 */

public class Province extends DataSupport {
    private int id;//省id
    private String provinceName;//省名
    private int provinceCode;//省代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
