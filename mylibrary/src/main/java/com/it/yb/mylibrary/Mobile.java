package com.it.yb.mylibrary;

public class Mobile {
    private String owner;
    private String mobileNo;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Mobile(String owner, String mobileNo) {

        this.owner = owner;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "owner='" + owner + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
