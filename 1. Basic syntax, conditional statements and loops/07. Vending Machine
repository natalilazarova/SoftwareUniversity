package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double nuts=2.0;
        double water=0.7;
        double crisps=1.5;
        double soda=0.8;
        double coke=1.0;
        double sum=0.0;
        double money;
        
        String command=scan.nextLine();
        
        while(!command.equals("Start")){
            money= Double.parseDouble(command);
            if(money==0.1||money==0.2||money==0.5||money==1.0||
                    money==2.0){
                sum=sum+money;
            }
            else{
                System.out.printf("Cannot accept %.2f",money);
                System.out.println();
            }
            command=""+command;
       command=scan.nextLine();
        }
        String commandd=scan.nextLine();
        while(!commandd.equals("End")){
            switch (commandd){
                case "Nuts":
                    if(sum>=nuts){
                        sum=sum-nuts;
                        System.out.println("Purchased Nuts");}
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if(sum>=water){
                        sum=sum-water;
                        System.out.println("Purchased Water");}
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if(sum>=crisps){
                        sum=sum-crisps;
                        System.out.println("Purchased Crisps");}
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if(sum>=soda){
                        sum=sum-soda;
                        System.out.println("Purchased Soda");}
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if(sum>=coke){
                        sum=sum-coke;
                        System.out.println("Purchased Coke");}
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            commandd=scan.nextLine();

        }
        System.out.printf("Change: %.2f",sum);
    }
}
