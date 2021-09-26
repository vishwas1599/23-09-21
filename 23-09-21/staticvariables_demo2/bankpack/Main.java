package com.thbs.bankpack;

import com.thbs.accountpack.account;

public class Main {

    public static void main(String[] args) {
	// write your code here
        account a1 =new account("Savings",4321.098);
        System.out.println(a1);
        System.out.println("Amount withdrawed"+a1.withdraw(1000));
        System.out.println(a1);
        System.out.println("Amount deposited"+a1.deposit(15000));
        System.out.println(a1);
        System.out.println("--------------------------------------");
        account a2 =new account("Current",987654.789);
        System.out.println("current account status "+a2);

    }
}
