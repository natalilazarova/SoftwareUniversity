import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n=Integer.parseInt(scan.nextLine());
        int[] number=new int[n];
        int i;
        for ( i = 0; i < number.length; i++) {
            number[i]=Integer.parseInt(scan.nextLine());
        }
        for ( i = number.length-1; i >=0 ; i--) {
            System.out.printf("%d ",number[i]);
        }
      }
    }
