
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input=scan.nextLine().split(" ");
        int[] arr=new int[input.length];
        boolean isEqual=false;

        for (int i=0;i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        for (int i = 0; i <arr.length; i++) {
            int index=i,leftSum=0,rightSum=0;

            for (int j = 0; j <=index-1 ; j++) {
                leftSum=leftSum+arr[j];
            }
            for (int j =index+1; j <arr.length ; j++) {
                rightSum=rightSum+arr[j];
            }
            if(leftSum==rightSum){
                isEqual=true;
                System.out.println(index);
            }

        }
        if(!isEqual){
            System.out.println("no");
        }
    }

}
