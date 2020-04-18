import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input=scan.nextLine().split(" ");
        int[] arr=new int[input.length];

        for (int i=0;i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);
        }

        for (int i = 0; i <arr.length ; i++) {
            int number=arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                int secondNumber=arr[j];
                if(number<=secondNumber){
                    break;
                }
                else if(j==arr.length-1){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println(arr[arr.length-1]);
     }
   }
