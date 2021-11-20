package com.company;
import  java.util.Scanner;
import  java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("1) STONE ");
        System.out.println("2) PAPER");
        System.out.println("3) SCISSOR");
        System.out.print("ENTER THE NUMBER YOUR CHOICE :");
        int input=sc.nextInt();
        System.out.print("Your choice is ");
        switch(input){
            case 1:
                System.out.println("STONE");
                break;
            case 2:
                System.out.println("PAPER");
                break;
            case 3:
                System.out.println("SCISSOR");
                break;
        }
        Random rn = new Random();
        int answer = rn.nextInt(3) + 1;
//        System.out.println(answer);
        System.out.print("computer select ");
        switch(answer) {
            case 1:
                System.out.println("STONE");
                break;
            case 2:
                System.out.println("PAPER");
                break;
            case 3:
                System.out.println("SCISSOR");
                break;
        }
        if (input==1&&answer==2){
            System.out.println("computer wins");
        }
        else if(input==2&&answer==3){
                System.out.println("computer wins");
            }
        else if (input==3&&answer==1){
            System.out.println("computer win");
        }
        else if(input==answer){
            System.out.println("Match tie do again");
        }
    }
}


