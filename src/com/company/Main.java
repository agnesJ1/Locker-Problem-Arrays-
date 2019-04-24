package com.company;
/*
Write a program to simulate the following experiment. You have 100 closed lockers.
Start with the first locker and for every locker open it.
Now, starting with the second locker, for this locker and every second locker after that, if the locker is open, close it; if it is closed, open it.
Then, starting with the third locker, for this locker and every third locker after that, if the locker is open, close it; if it is closed, open it.
Continue with the nth locker changing the “position” of every nth locker until n = 100. Print out the locker numbers that remain open.
What do you notice about the lockers that remain open?
 */


public class Main {

    public static void main(String[] args) {
        boolean [] locker = new boolean[100];

        for (int i = 1; i < locker.length; i++) {
            for (int t = i; t < locker.length; t += i) {
                if (!locker[t]){
                    locker[t] = true;
                }
                else {
                    locker[t] = false;
                }
            }
        }
            for (int i = 1; i < locker.length; ++i) {

            System.out.println(locker [i]  + " " + i);
        }

    }
}
