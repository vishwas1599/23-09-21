package com.thbs;

public class address {
    private int doorno;
    private String street;
    private String city;
    private String state;
    private int pincode;

    public address(int doorno, String street, String city, String state, int pincode) {
        this.doorno = doorno;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "address{" +
                "doorno=" + doorno +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}

