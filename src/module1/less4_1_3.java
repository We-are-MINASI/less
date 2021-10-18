package module1;

import java.util.Scanner;

public class less4_1_3 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        String a = (in.nextLine());
        String[] nuA = a.split(" ");
        String f = nuA[0];
        int f1 = Integer.parseInt(f.trim());
        String g = nuA[1];
        int g1 = Integer.parseInt(g.trim());
        Integer.toBinaryString(f1);
        int b=(1<<g1), c=f1^b;
        if(c<f1){
            System.out.println(f1);
        }else{System.out.println(c);}
    }
}
//int b = 0, c = Integer.parseInt(a.trim());
//System.out.println(f1+" "+g1);