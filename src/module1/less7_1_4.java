package module1;
import java.util.Scanner;
public class less7_1_4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int d = 0;
        while (a-b>=0) {
            a-=b;d++;
        }
        System.out.println(d + " " + a);
    }
}