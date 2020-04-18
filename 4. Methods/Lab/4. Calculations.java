import java.util.Scanner;

public class Triangle {
    public static void add(int firstNum,int secondNum){
        int result=(firstNum+secondNum);
        System.out.println(result);
    }
    public static void multiply(int firstNum,int secondNum){
        int result=(firstNum*secondNum);
        System.out.println(result);
    }
    public static void subtract(int firstNum,int secondNum){
        int result=(firstNum-secondNum);
        System.out.println(result);
    }
    public static void divide(int firstNum,int secondNum){
        int result=(firstNum/secondNum);
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input=scan.nextLine();
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

       switch (input){
           case "add":
            add(firstNum,secondNum);
            break;
           case "multiply":
               multiply(firstNum,secondNum);
               break;
           case "subtract":
               subtract(firstNum,secondNum);
               break;
           case "divide":
               divide(firstNum,secondNum);
               break;
       }
    }
}

