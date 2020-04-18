package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startYield=Integer.parseInt(scan.nextLine());
        int day=0;
        int sum=0;

    for( day=0;startYield>=100;day++){
        sum=sum+startYield-26;
        startYield=startYield-10;
       
       if(startYield<100&&startYield>=0){
           sum=sum-26;
       }
    }
        System.out.println(day);
        System.out.println(sum);
    }

}
