package module2;

import java.util.Scanner;
public class less1_1 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a1 = Integer.toString(n, 2), b1=Integer.toString(n, 8),c1=Integer.toString(n, 16);
        System.out.println(a1+"\n"+b1+"\n"+c1);
        System.out.println(n == (byte)n ? "YES" : "NO");
        System.out.println(n == (short)n ? "YES" : "NO");
    }
}


//System.out.println("In short: " + (n == (short)n ? "yes" : "no"));

        //Integer.valueOf(octal_value, 8)

        //Integer.valueOf(hex_value, 16)
        //Integer.toString(x, 2),

        //Integer.toString(x, 8)

        //Integer.toString(x, 16)