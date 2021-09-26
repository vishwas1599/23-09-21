package com.thbs.mainpack;

public class avg {
    public double avrg(int ...numbers)
    {
        int sum=0;
        for(int n:numbers)
        {
            sum+=n;

        }
        return (sum/numbers.length);
    }
}
