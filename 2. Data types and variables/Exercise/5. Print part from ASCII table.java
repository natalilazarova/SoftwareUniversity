package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start=Integer.parseInt(scan.nextLine());
        int end=Integer.parseInt(scan.nextLine());
        for(int i=start;i<=end;i++){
            System.out.print((char) i+" ");
// or 	     System.out.printf("%c",i);

        }        
    }
}
