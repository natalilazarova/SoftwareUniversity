import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int n=Integer.parseInt(scan.nextLine());
      String[] firstArr=new String[n];
      String[] secondArr=new String[n];

        for (int i = 0; i < n; i++) {
            String[] input=scan.nextLine().split(" ");
            if(i%2==0){
                firstArr[i]=input[0];
                secondArr[i]=input[1];
            }
            else{
                firstArr[i]=input[1];
                secondArr[i]=input[0];
            }
        }
        System.out.println(String.join(" ",firstArr));
        System.out.println(String.join(" ",secondArr));

        }
    }
