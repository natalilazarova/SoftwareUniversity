import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] input1arr=scan.nextLine().split(" ");
        String[] input2arr=scan.nextLine().split(" ");

        for (int i = 0; i <input2arr.length ; i++) {
            for (int j = 0; j <input1arr.length ; j++) {
                if(input2arr[i].equals(input1arr[j])){
                    System.out.print(input2arr[i]+ " ");
                }
            }
        }
     }
 }
