package module1;

import java.util.Scanner;

public class less2_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y,z,h;
        y=x%10;
        x/=10;
        z=x%10;
        x/=10;
        h=x%10;
        int summ = y + z + h;
        System.out.println(summ);
    }
}
