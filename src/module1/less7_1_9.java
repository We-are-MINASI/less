package module1;
import java.util.Scanner;
public class less7_1_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int m = 99;
        if(a%10>0) {m=a%10;}
        while (a>0) {
            if(a%10<m && a%10>0) {m=a%10;}
            a/=10;
        }
        System.out.println(m);
    }
}
