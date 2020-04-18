package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int lostGame=Integer.parseInt(scan.nextLine());
        double headsetPrice=Double.parseDouble(scan.nextLine());
        double mousePrice=Double.parseDouble(scan.nextLine());
        double keyboardPrice=Double.parseDouble(scan.nextLine());
        double displayPrice=Double.parseDouble(scan.nextLine());

        int trashHeadset=lostGame/2;
        int trashMouse=lostGame/3;
        int trashKeyboard=lostGame/6;
        int trashDisplay=lostGame/12;

        double sum=displayPrice*trashDisplay+
                keyboardPrice*trashKeyboard+
                mousePrice*trashMouse+
                headsetPrice*trashHeadset;

        System.out.printf("Rage expenses: %.2f lv.",sum);

    }
}
