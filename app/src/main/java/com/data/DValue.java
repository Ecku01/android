package com.data;

/**
 * Created by cszsombi on 2016.10.09..
 */

public class DValue {
    private Long mTimeStamp;
    //private Double mValue;
    private DSymbol mSymbol;
    private Integer mHazai;
    private Integer mVendeg;
    private String mSHazai;
    private String mSVendeg;
    public DValue() {
    }

    public DValue(Long mTimeStamp, DSymbol mSymbol, Integer mHazai, Integer mVendeg, String mSHazai, String mSVendeg) {
        this.mTimeStamp = mTimeStamp;
        //this.mValue = mValue;
        this.mSymbol = mSymbol;
        this.mHazai= mHazai;
        this.mVendeg=mVendeg;
        this.mSHazai = mSHazai;
        this.mSVendeg =mSVendeg;
    }

    public Long getTimeStamp() {
        return mTimeStamp;
    }

    public void setTimeStamp(Long mTimeStamp) {
        this.mTimeStamp = mTimeStamp;
    }
/*
    public Double getmValue() {
        return mValue;
    }

    public void setValue(Double mValue) {
        this.mValue = mValue;
    }
*/
    public DSymbol getSymbol() {
        return mSymbol;
    }

    public void setSymbol(DSymbol mSymbol) {
        this.mSymbol = mSymbol;
    }

    public Integer getHazai()
    {
        return mHazai;
    }
    public Integer getVendeg()
    {
        return mVendeg;
    }
    public String getSHazai()
    {
        return mSHazai;
    }
    public String getSVendeg()
    {
        return mSVendeg;
    }
}
