package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input=scan.nextLine().split(" ");
        int[] arr=new int[input.length];

        for (int i=0;i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        int length=1;
        int bestLength=0;
        int endIndex=-1;
        for (int i=0;i<arr.length-1;i++){

            if(arr[i]==arr[i+1]){
                length++;
                if(length>bestLength){
                    bestLength=length;
                    endIndex=i+1;
                }
            }
            else{
                length=1;
            }
        }
        for (int i = endIndex; i >endIndex-bestLength ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
