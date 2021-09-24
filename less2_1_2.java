package module1;

import java.util.Scanner;

public class less2_1_2 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c1=a%1000;
        int c2=a%100;
        int c3=a%10;
        int c=(c1-c2)/100+(c2-c3)/10+c3;
        System.out.println(c);
    }

}
