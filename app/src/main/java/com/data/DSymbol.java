package com.data;

import java.util.ArrayList;

/**
 * Created by cszsombi on 2016.10.09..
 */

public class DSymbol {
    private String mCode;
    private ArrayList<DValue> mValues;

    public DSymbol() {
    }

    public DSymbol(String mCode, ArrayList<DValue> mValues) {
        this.mCode = mCode;
        this.mValues = mValues;
    }

    //Alt+Insert
    public String getCode() {
        return mCode;
    }

    public ArrayList<DValue> getValues() {
        return mValues;
    }

    public void setCode(String mCode) {
        this.mCode = mCode;
    }

    public void setValues(ArrayList<DValue> mValues) {
        this.mValues = mValues;
    }
}
