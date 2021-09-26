package com.thbs.mainpack;

import com.thbs.vpack.car;

public class Main {

    public static void main(String[] args) {
	// write your code here
        car c1=new car(5794,"swift",250,500,"dezire");
        System.out.println(c1);

        System.out.println(c1.start());

        int inc_value=c1.inc_speed(40);

        if(inc_value==0)
            System.out.println("Alert Stop the car!!!!!!!!");
        else
            System.out.println("enjoy Driving");


        System.out.println(c1.stop());
    }
}
