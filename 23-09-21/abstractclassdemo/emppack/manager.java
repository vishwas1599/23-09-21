package com.thbs.emppack;

public class manager extends employee{

    private String deptName;
    private int empcount;

    public manager(int empId, String empName, int sal,String deptName,int empcount) {

        super(empId, empName, sal);
        this.deptName=deptName;
        this.empcount=empcount;

    }

    @Override
    public String toString() {
        return "manager{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", sal=" + sal +
                ", deptName='" + deptName + '\'' +
                ", empcount=" + empcount +
                '}';
    }

    @Override
    public double calcNetSal() {
        return 20000;
    }

    public String getDeptName()
    {
        return deptName;
    }
    public int getEmpcount()
    {
        return empcount;
    }


}

