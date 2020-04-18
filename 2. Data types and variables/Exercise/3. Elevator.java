package com.company;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int countPerson=Integer.parseInt(scan.nextLine());
        int capacityElevator=Integer.parseInt(scan.nextLine());
            int courses=(int) Math.ceil((double)countPerson/capacityElevator);
        System.out.println(courses);
    }

}

