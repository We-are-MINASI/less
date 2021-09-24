package module1;

import java.util.Scanner;
public class less2_1_3 {
    public static void main(String[] Args){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=(a+2)-a%2;
        System.out.println(b);
    }
}