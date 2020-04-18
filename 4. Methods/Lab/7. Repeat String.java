import java.util.Scanner;

public class Triangle {

    public static String repeat(String string,int num){
        String result="";

        for (int i = 0; i <num ; i++) {
          result=result+string;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string=scan.nextLine();
        int a=Integer.parseInt(scan.nextLine());
        String total= repeat(string,a);
        System.out.println(total);

       }

}
