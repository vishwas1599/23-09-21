package co.thbs.emppack;

public class manager extends employee{

        private String deptName;
        private int empcount;

         public manager(int empId, String empName, int sal,String deptName,int empcount) {

        super(empId, empName, sal);
        this.deptName=deptName;
        this.empcount=empcount;

    }

    @Override
    public String getDetails() {
        return (super.getDetails()+" "+deptName+" "+empcount);
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

