package module1;

import java.util.Scanner;
public class less4_1_2 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0){int b=(1<<a); System.out.println(b);} else System.out.println(a);
    }
}
