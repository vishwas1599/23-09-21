package com.thbs.vpack;

public abstract class vehicle implements automobile {
    protected int regNo;
    protected String model;
    protected int curr_speed;


    public vehicle(int regNo, String model, int curr_speed) {
        this.regNo = regNo;
        this.model = model;
        this.curr_speed = curr_speed;
    }

    @Override
    public String start() {
        return "vehicle started";
    }

    @Override
    public abstract int inc_speed(int n);

    @Override
    public String stop() {
        return "Vehicle stopped";
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "regNo=" + regNo +
                ", model='" + model + '\'' +
                ", curr_speed=" + curr_speed +
                '}';
    }
}
