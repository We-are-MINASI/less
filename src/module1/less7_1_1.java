package module1;
import java.util.Scanner;
public class less7_1_1 {
    public static void main(String[] Args) {
        Scanner in =new Scanner(System.in);
        int a=  in.nextInt();
        int c=1;
        while (a>= 0) {
            a = in.nextInt();
            c++;
        }
        System.out.println(c);
    }
}
