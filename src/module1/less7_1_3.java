package module1;
import java.util.Scanner;
public class less7_1_3 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c=0;
        int b=a;
        while ((a<100) && (a>9)) {
            while (b>0) {
                c+=b%10;
                b/=10;
            }
            a=in.nextInt();
            b=a;
        }
        System.out.println(c);
    }
}