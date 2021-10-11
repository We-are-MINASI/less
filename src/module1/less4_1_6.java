package module1;

import java.util.Scanner;

public class less4_1_6 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i=0,b=2^31,c=0,d=a;
        while(i<b){
            i++;
            d=(d<<1);
        }
        if(a==2 || a==4){System.out.println(c);} else {System.out.println(d);}
    }
}
//int b = 0, c = Integer.parseInt(a.trim());