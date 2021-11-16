package module1;
import java.util.Scanner;
public class less6_1_3 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        System.out.print(a + " ");
        if ((a%100>=10 && a%100<20)||(a%10>4)) {System.out.println("TORTOV");}
        else if (a%10==1) {System.out.println("TORT");}
        else if (a%10>1 && a%10<5) {System.out.println("TORTA");}
        else if (a==0) {System.out.println("TORTOV");}
    }
}
