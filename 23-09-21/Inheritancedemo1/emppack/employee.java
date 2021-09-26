package co.thbs.emppack;

public class employee {
    protected int empId;
    protected String empName;
    protected int sal;

    public employee(int empId, String empName, int sal) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }
    public String getDetails()
    {
        return (empId+" "+empName+" "+sal);
    }
public int getSal()
{
    return sal;
}

}
