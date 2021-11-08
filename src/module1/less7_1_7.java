package module1;
import java.util.Scanner;
public class less7_1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int c=0;
        while (n>0) {n/=10;c++;}
        System.out.println(c);
    }
}