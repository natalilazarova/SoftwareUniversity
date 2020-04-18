import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      String input1=scan.nextLine();
      String input2=scan.nextLine();

      String[] string1=input1.split(" ");
      String[] string2=input2.split(" ");

      int[] arr1=new int[string1.length];
      int[] arr2=new int[string2.length];
      int sum1=0,sum2=0;
      boolean areEqual=true;
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=Integer.parseInt(string1[i]);
            sum1=sum1+arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]=Integer.parseInt(string2[i]);
            sum2=sum2+arr2[i];
        }

        for (int i = 0; i <arr1.length ; i++) {
                if(arr1[i]!=arr2[i]){
                    System.out.printf("Arrays are not identical." +
                            " Found difference at %d index.",i);
                    areEqual=false;
                    break;
                }
        }
        if(areEqual==true){
            System.out.printf("Arrays are identical. Sum: %d",sum1);
        }
    }
    }
