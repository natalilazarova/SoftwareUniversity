import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      String input=scan.nextLine();
      String[] arrString=input.split(" ");
      int[] numbers=new int[arrString.length];
      int sumOdd=0,sumEven=0;

        for (int i = 0; i < arrString.length; i++) {
            numbers[i]=Integer.parseInt(arrString[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                sumEven=sumEven+numbers[i];
            }else {
                sumOdd
        }
        int result=sumEven-sumOdd;
        System.out.println(result);
      }
    }
