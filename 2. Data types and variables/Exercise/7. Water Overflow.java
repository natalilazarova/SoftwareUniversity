package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        int sum=0;
        for(int i=0;i<n;i++){
            int inputLiters=Integer.parseInt(scan.nextLine());
            sum=sum+inputLiters;
            if(sum>255){
                sum=sum-inputLiters;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);
    }
}
