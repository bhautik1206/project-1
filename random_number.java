package com.company;
import java.util.Random;
import java.util.Scanner;
public class random_number {
    static int  Randomidea(int randomNumber,int mac) {

            if (mac == randomNumber) {
                System.out.println("Tie happen");
            } else if (randomNumber <= mac) {
                System.out.println("you win");
            } else if (randomNumber >= mac) {
                System.out.println("computer win");
            } else {
                System.out.println("NO number choose ");
            }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int randomNumber = (int) (Math.random()*(10-1)) + 1;
        System.out.println("ENTER NUMBER BETWEEN 1 TO 10 ");
        System.out.println("enter the number :");
        int mac=sc.nextInt();
        random_number x=new random_number();
        System.out.println("computer number is : ");
        System.out.println(randomNumber);
        x.Randomidea(randomNumber,mac);

    }
}
