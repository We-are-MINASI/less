package module1;

import java.util.Scanner;

public class less5_2_6 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        String a = (in.nextLine());
        String[] nuA = a.split(" ");
        String f = nuA[0];
        double x1 = Double.parseDouble(f.trim()), x2=x1*x1*2;
        String g = nuA[1];
        double y1 = Double.parseDouble(g.trim());
        if (x1<1 || x1==1){if (y1>1-x1 || y1==1-x1){if (x1>0 || x1==0){System.out.println("YES");}else{if (y1<x2 || y1==x2){System.out.println("NO");}else{System.out.println("YES");}}}else{System.out.println("NO");}}else{System.out.println("NO");}
    }
}
//System.out.println(f1+"\n"+g1);
