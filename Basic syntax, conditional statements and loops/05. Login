package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String username=scan.nextLine();
      String password="";
      boolean blocked=false;
    
      for(int i=username.length()-1;i>=0;i--){
          password+=username.charAt(i);
      }
      for(int i=1;i<=4;i++){
          String currentPassword=scan.nextLine();
          if(password.equals(currentPassword)){
              System.out.print(String.format("User %s logged in.",username));
          break;
          }
          else if(i<4){
              System.out.println("Incorrect password. Try again.");
          }if(i==4){
              blocked=true;}
      }
      if(blocked){
          System.out.printf("User %s blocked!",username);
      }
   }
}
