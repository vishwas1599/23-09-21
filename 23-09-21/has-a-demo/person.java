package com.thbs;

public class person {
private int personID;
private String personName;
private address adrs;

    public person(int personID, String personName, address adrs) {
        this.personID = personID;
        this.personName = personName;
        this.adrs = adrs;
    }

    @Override
    public String toString() {
        return "person{" +
                "personID=" + personID +
                ", personName='" + personName + '\'' +
                ", adrs=" + adrs +
                '}';
    }
}
