package module1;

import java.util.Scanner;
public class less4_1 {
    public static void main(String[] Args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();
        int b=(a>>i); a=(b<<i);
        System.out.println(a);

    }
}
