package com.thbs.playerpack;
import java.util.Random;//to get random numbers
import java.util.*;

public class dice {

    private int fvalue;

    public int roll() {
        Random rand = new Random();
        fvalue = ((int) rand.nextInt(5) + 1);
        return fvalue;


    }

    public int getFvalue() {
        return fvalue;
    }
}
