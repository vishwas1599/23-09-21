package com.thbs.playerpack;

public class player {
    dice d1;//each player throws 2 dice
    dice d2;
    public player()
    {
        d1=new dice();
        d2=new dice();

    }
    public int play()
    {
        return(d1.roll()+d2.roll());
    }
    public int getd1score() {
        return (d1.getFvalue());
    }
    public int getd2score() {
        return (d2.getFvalue());
    }


}
