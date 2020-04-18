import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        int []num=new int[n];
        int sum=0;
        for (int i = 0; i <n ; i++) {
            num[i]=Integer.parseInt(scan.nextLine());
            System.out.print(num[i]+" ");
            sum=sum+num[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
