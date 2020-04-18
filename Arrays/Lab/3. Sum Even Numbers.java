import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String values=scan.nextLine();
        String[] items=values.split(" ");
        int[] arr=new int[items.length];
        int sum=0;
        int j;
        for (int i = 0; i <items.length ; i++) {
            arr[i]=Integer.parseInt(items[i]);
        }
        for ( j = 0; j <arr.length ; j++) {
            if(arr[j]%2==0){
                sum=sum+arr[j];
            }
        }
        System.out.println(sum);

      }
    }
