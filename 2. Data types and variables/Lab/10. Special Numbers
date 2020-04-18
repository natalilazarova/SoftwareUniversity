package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        int n=Integer.parseInt(scan.nextLine());
        for(int i=1;i<=n;i++){
            int inputNum=i;
            int sum=0;

            while(inputNum>0) {
                int c =inputNum%10;
                sum=sum+c;
                inputNum=inputNum/10;
            }
            if(sum==5||sum==7||sum==11){
                System.out.printf("%d -> True\n",i);
            }else {
                System.out.printf("%d -> False\n",i);
            }
        }
    }
}
