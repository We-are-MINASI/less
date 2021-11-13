package module1;

import java.util.Scanner;

public class less5_2_6 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        String a = (in.nextLine());
        String[] nuA = a.split(" ");
        String f = nuA[0];
        double x1 = Double.parseDouble(f.trim()), d1=x1*x1, x2=x1*(-1);
        String g = nuA[1];
        double y1 = Double.parseDouble(g.trim()), d2=y1*y1, e=d1+d2;
    }
}
//System.out.println(f1+"\n"+g1);
