package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        double bestKegVolume=-1.0;
        String winner="";

        for (int i = 0; i <n ; i++) {

            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double volume=Math.PI*Math.pow(radius,2)*height;

            if(volume>bestKegVolume){
                bestKegVolume=volume;
                winner=model;
            }
        }
        System.out.println(winner);
    }
}
