import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle {
    public static int getMax(int var1,int var2){
        if(var1>var2){
            return var1;
        }else return var2;
    }
    public static char getMax(char var1,char var2){
        if(var1>var2){
            return var1;
        }else return var2;
    }
    public static String getMax(String var1,String var2){

        if(var1.compareTo(var2)>=0){
            return var1;
        }else return var2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dataType=scan.nextLine();

        switch (dataType){
            case "int":
                int a1=Integer.parseInt(scan.nextLine());
                int b1=Integer.parseInt(scan.nextLine());
                int result1=getMax(a1,b1);
                System.out.println(result1);
                break;
            case "char":
                char a2=scan.nextLine().charAt(0);
                char b2=scan.nextLine().charAt(0);
                char result2=getMax(a2,b2);
                System.out.println(result2);
                break;
            case "string":
                String a3=scan.nextLine();
                String b3=scan.nextLine();
                String result3=getMax(a3,b3);
                System.out.println(result3);
                break;
        }


       }

}
