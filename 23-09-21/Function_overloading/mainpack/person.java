package com.thbs.mainpack;

public class person {
    public static int count;
    private int pid;
    private String pName;


    static {
        count=0;
    }

    public person(int pid, String pName) {
        this.pid = pid;
        this.pName = pName;
        ++count;
    }

    @Override
    public String toString() {
        return "person{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                '}';
    }
}
