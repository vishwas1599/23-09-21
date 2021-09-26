package com.thbs;

public class student {
    private int stu_id;
    private String name;
    private int subm1;
    private int subm2;
    private int subm3;

    public student(int stu_id, String name, int subm1, int subm2, int subm3) {
        this.stu_id = stu_id;
        this.name = name;
        this.subm1 = subm1;
        this.subm2 = subm2;
        this.subm3 = subm3;
    }
    private double calc_per()
    {
        return (((subm1+subm2+subm3)/3));

    }

    @Override
    public String toString() {
        return "student{" +
                "stu_id=" + stu_id +
                ", name='" + name + '\'' +
                ", subm1=" + subm1 +
                ", subm2=" + subm2 +
                ", subm3=" + subm3 +"PERCENTAGE : " +calc_per() +
                '}';
    }
}
