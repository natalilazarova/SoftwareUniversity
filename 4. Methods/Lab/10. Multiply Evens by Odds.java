import java.util.Scanner;

public class MultipleEvenByOdds {
    public static int getSumOfEvensAndOdds(int num){
        int evensSum=getSumOfEvenDigits(num);
        int odsSum=getSumOfOddDigits(num);
        return evensSum*odsSum;
    }
    private static int getSumOfEvenDigits(int num) {
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
        int[] result = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 == 0) {
                result[i] = digits[i];
            }
        }
        int sum=0;
        for (int i = 0; i <result.length ; i++) {
            sum=sum+result[i];
        }
        return sum;
    }
    private static int getSumOfOddDigits(int num) {
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
        int[] result = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 == 1) {
                result[i] = digits[i];
            }
        }
        int sum=0;
        for (int i = 0; i <result.length ; i++) {
            sum=sum+result[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int num=Integer.parseInt(scan.nextLine());

        System.out.println(Math.abs(getSumOfEvensAndOdds(num)));


    }
}

