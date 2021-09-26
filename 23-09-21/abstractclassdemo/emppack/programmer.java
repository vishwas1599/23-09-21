package com.thbs.emppack;

public class programmer extends employee {
    private int noOfProjects;
    private String skillsets;

    public programmer(int empId, String empName, int sal,int noOfProjects,String skillsets) {
        super(empId, empName, sal);
        this.noOfProjects=noOfProjects;
        this.skillsets=skillsets;

    }

    @Override
    public String toString() {
        return "programmer{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", sal=" + sal +
                ", noOfProjects=" + noOfProjects +
                ", skillsets='" + skillsets + '\'' +
                '}';
    }

    @Override
    public double calcNetSal() {
        return 15000;
    }

    public int getNoOfProjects()
    {
        return noOfProjects;
    }
    public String getSkillsets()
    {
        return skillsets;
    }

}
