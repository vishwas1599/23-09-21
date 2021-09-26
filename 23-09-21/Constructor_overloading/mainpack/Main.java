package com.thbs.mainpack;

import com.thbs.utility.summation;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* summation s=new summation();
        System.out.println(s.add(2,4.67F,5.8889));
        System.out.println(s.add(99,89));
        System.out.println(s.add("vish","was"));
        System.out.println(s.add(8.98764,4.5689766544));*/
        avg a=new avg();
        System.out.println(a.avrg(1,2,3,4,5,6,7,89,87,3,999,-578,554,33,2));
        person p1=new person(1,"vish");
        person p2=new person(2,"vic");
        person p3=new person(4,"alu");
        System.out.println(person.count);



    }
}
