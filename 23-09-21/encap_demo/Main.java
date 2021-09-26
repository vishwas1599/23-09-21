package com.thbs;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
       /* student s1=new student(111,"Vishwas",97,95,98);
        System.out.println(s1);*/
Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of entries");
        int n= s.nextInt();
student [] st =new student[n];
for(int i=1;i<n;i++)
{
    System.out.println("Enter the details of student"+i);
    int stu_id=s.nextInt();
    String name=s.next();
    int subm1=s.nextInt();
    int subm2=s.nextInt();
    int subm3=s.nextInt();
    st[i]=new student(stu_id,name,subm1,subm2,subm3);
}
for(int i=1;i<n;i++)
{
    System.out.println("details of student"+i);
    System.out.println(st[i]);
}


    }
}
