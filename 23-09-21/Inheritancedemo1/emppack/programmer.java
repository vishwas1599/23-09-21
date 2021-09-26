package co.thbs.emppack;

public class programmer extends employee {
    private int noOfProjects;
    private String skillsets;

    public programmer(int empId, String empName, int sal,int noOfProjects,String skillsets) {
        super(empId, empName, sal);
        this.noOfProjects=noOfProjects;
        this.skillsets=skillsets;

    }

    @Override
    public String getDetails() {
        return (super.getDetails()+" "+noOfProjects+" "+skillsets);
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
