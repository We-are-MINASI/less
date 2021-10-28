package module1;

import java.util.Scanner;

public class less4_1_5 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        String a = (in.nextLine());
        String[] nuA = a.split(" ");
        String f = nuA[0];
        int f1 = Integer.parseInt(f.trim());
        String g = nuA[1];
        int g1 = Integer.parseInt(g.trim()), g2 = g1 + 1;
        //System.out.println(f1+" "+g1);
        Integer.toBinaryString(f1);

    }
}
