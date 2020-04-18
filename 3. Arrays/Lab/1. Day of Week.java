import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] days=new String []{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int number=Integer.parseInt(scan.nextLine());
        if(number>=1&&number<=7){
            number=number-1;
            System.out.println(days[number]);}
        else{
            System.out.println("Invalid day!");
            }
        }

    }
