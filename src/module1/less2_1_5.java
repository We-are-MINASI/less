package module1;

import java.util.Scanner;
public class less2_1_5 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int h=a/3600,m=(a-h*3600)/60,s=a-h*3600-m*60;
        System.out.println(h+":"+m+":"+s);
    }
}