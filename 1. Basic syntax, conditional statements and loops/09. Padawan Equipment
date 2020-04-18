package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum=Double.parseDouble(scan.nextLine());
        int countOfStudents=Integer.parseInt(scan.nextLine());
        double priceLightsaber=Double.parseDouble(scan.nextLine());
        double priceRobe=Double.parseDouble(scan.nextLine());
        double priceBelt=Double.parseDouble(scan.nextLine());
        double TotalLightsaber=Math.ceil(countOfStudents*1.1)*priceLightsaber;
        double TotalRobe=countOfStudents*priceRobe;
        int freebelts=countOfStudents/6;
        double Totalbelts=(countOfStudents-freebelts)*priceBelt;
        double finalSum=Totalbelts+TotalLightsaber+TotalRobe;
        if(finalSum>sum){
            System.out.println(String.format("Ivan Cho will need %.2flv more.",finalSum-sum));
        }
        else {
            System.out.printf("The money is enough - it would cost %.2flv.",finalSum);
        }
    }
