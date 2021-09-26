package com.thbs.stadium;

import com.thbs.playerpack.player;// bcoz player and dice are in other package or folder to use in this import it

public class Main {

    public static void main(String[] args) {
        // write your code here
        player p1 = new player();
        int p1score = p1.play();
        int p1d1score = p1.getd1score();
        int p1d2score = p1.getd2score();


        System.out.println("P1 score  " + p1score);
        System.out.println("p1d1 score  " + p1d1score + "  " + "p1d2score  " + p1d2score);


        player p2 = new player();
        int p2score = p2.play();
        int p2d1score = p2.getd1score();
        int p2d2score = p2.getd2score();


        System.out.println("P2 score " + p2score);
        System.out.println("p2d1 score  " + p2d1score + "  " + "p2d2score  " + p2d2score);

        System.out.println("Results of MATCH \t");
        if (p1score > p2score)
            System.out.println("Player 1 is winner");
        else if (p2score > p1score)
            System.out.println("Player 2 is winner");
        else
            System.out.println("Match draw");


    }
}
