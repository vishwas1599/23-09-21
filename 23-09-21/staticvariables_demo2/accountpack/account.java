package com.thbs.accountpack;
import java.util.Random;
public class account {
    private static long count;
    private final long accNo;//it shows error coz it is not initialised at early stage
    private String accType;
    private double balance;

    static {
        count=23456780;
    }
    public static long getCount()
    {
        //return(++count); //for normal withouut using random variable
        Random rand=new Random();
        count=rand.nextInt(1000)+5678;//using random variable to create account
        return count;

    }

    public account(String accType, double balance) {
        this.accNo=getCount();//type this manually
        this.accType = accType;
        this.balance = balance;
    }
    public double deposit(double amount)
    {
    balance+=amount;
    return amount;
    }
    public double withdraw(double amount)
    {
        balance-=amount;
        return amount;
    }
    public double getBalance()
    {
        return  balance;
    }

    @Override
    public String toString() {
        return "account{" +
                "accNo=" + accNo +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
