package module1;

import java.util.Scanner;

public class less4_1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();
        System.out.println(a << (32-i) >>> (32-i));
    }
}
