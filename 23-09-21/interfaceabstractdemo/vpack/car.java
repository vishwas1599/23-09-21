package com.thbs.vpack;

public class car extends vehicle {
    private int maxspeed;
    private String typeOfCar;

    public car(int regNo, String model, int curr_speed,int maxspeed,String typeOfCar) {
        super(regNo, model, curr_speed);//constructor chaining
        this.maxspeed=maxspeed;
        this.typeOfCar=typeOfCar;
    }



    @Override
    public int inc_speed(int n) {
        if(curr_speed+n < maxspeed)
            curr_speed+=n;
        else
            curr_speed=0;
            return (curr_speed);
    }
}
