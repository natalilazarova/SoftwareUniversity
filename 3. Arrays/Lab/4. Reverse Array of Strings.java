import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      String input=scan.nextLine();
      String[] arrString=input.split(" ");
        for (int i = arrString.length-1; i >=0; i--) {
            System.out.print(arrString[i] + " ");
        }
      }
    }
