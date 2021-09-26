package com.thbs.emppack;

public abstract class employee {
    protected int empId;
    protected String empName;
    protected int sal;

    public employee(int empId, String empName, int sal) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", sal=" + sal +
                '}';
    }

    public abstract double calcNetSal();// abstract method: which will not have any body only declaration
    public int getSal()
    {
        return sal;
    }

}
