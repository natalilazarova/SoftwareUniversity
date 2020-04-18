import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input=scan.nextLine().split(" ");
        int[] arr=new int[input.length];

        for (int i=0;i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
       int num=Integer.parseInt(scan.nextLine());
        int indexVzet;

        for (int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==num){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}

