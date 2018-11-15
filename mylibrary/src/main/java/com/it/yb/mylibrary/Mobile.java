package com.it.yb.mylibrary;

public class Mobile {
    private String owner;
    private String mobileNo;
    private  String address;

    public Mobile(String owner, String mobileNo, String address) {
        this.owner = owner;
        this.mobileNo = mobileNo;
        this.address = address;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "owner='" + owner + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
