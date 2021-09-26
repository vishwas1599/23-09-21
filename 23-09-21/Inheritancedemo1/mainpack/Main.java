package com.thbs.mainpack;

import co.thbs.emppack.employee;
import co.thbs.emppack.manager;
import co.thbs.emppack.programmer;
import com.thbs.taxpack.tax;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*employee e1=new employee(100,"vish",10000);
        System.out.println(e1.getDetails());

        manager m1=new manager(200,"was",1500,"HR",24);
        System.out.println(m1.getDetails());

        programmer p1=new programmer(300,"vivek",300,3,"JAva");
        System.out.println(p1.getDetails());
//------------------------------------------------------------------------------------------------------------------
        employee m2=new manager(199,"vas",234,"com",23);
        System.out.println(m2.getDetails());// it is upcasted we can get details of some methods i.e general
        //try getting m2.getdeptName() cant so we need to downcast in order to access

        manager m3=(manager)m2;
        System.out.println(m3.getDeptName());//downcasted now can use*/
 //-------------------------------------------------------------------------------------------------------------------------
      //utility or use  of upcasting[base class reference and child class object]

        employee[] em =new employee[4];
        em[0]=new employee(1,"kav",1000);
        em[1]=new manager(23,"lol",234,"ec",45);
        em[2]=new programmer(939,"dj",34,5,"sd");
        em[3]=new programmer(23,"ak",356,4,"c++");
        System.out.println("printing details of employees");
         for(employee e:em)
         {
             System.out.println(e.getDetails()+" "+ tax.calc_Tax(e));
             
         }


    }
}
