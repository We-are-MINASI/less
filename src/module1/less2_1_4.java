package module1;

import java.util.Scanner;
public class less2_1_4 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int r = a*c, n=0;
        b=b*c;
        while(b>99){b=b-100; r++;}
        System.out.println(r+" "+b);
    }
}

//        System.out.println(n);