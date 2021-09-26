package com.thbs.mainpack;

import com.thbs.emppack.employee;
import com.thbs.emppack.manager;
import com.thbs.emppack.programmer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //employee e1=new employee(100,"vish",2000);//cozs error bcz of abstract



        manager m1=new manager(123,"vishwas",20000,"HR",32);
        System.out.println(m1+"   "+m1.calcNetSal());

        programmer p1=new programmer(124,"arun",2134,3,"java");
        System.out.println(p1+"  "+p1.calcNetSal());
    }
}
