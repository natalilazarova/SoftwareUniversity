package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int NpokePowerNachalna=Integer.parseInt(scan.nextLine());
        int Mdistance=Integer.parseInt(scan.nextLine());
        int YkoefNaizcherpvane=Integer.parseInt(scan.nextLine());
        int n= NpokePowerNachalna;
        int target=0;

        while(n>=Mdistance){
           n=n-Mdistance;
         target++;
         double percent=NpokePowerNachalna/2.0;
         if(n==percent&&YkoefNaizcherpvane!=0){
             n=  n/YkoefNaizcherpvane;
         }
        }
        System.out.println(n);
        System.out.print(target);

    }

}


