package module1;

import java.util.Scanner;
public class less4_1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();
        System.out.println((a ^ (int)Math.pow(2,i)));
    }
}