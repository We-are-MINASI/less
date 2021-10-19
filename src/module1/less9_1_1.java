package module1;

import java.util.Scanner;

public class less9_1_1 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),x=0,b=(int)(Math.log10(a)+1),e=0;
        while(x<b){
            x++;
            e=e+a%10;
            a=a/10;
        }
        System.out.println(e);
    }
}
