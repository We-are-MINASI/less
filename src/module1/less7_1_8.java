package module1;
import java.util.Scanner;
public class less7_1_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;
        while (n>0) {
            if(n%2==1) {a=n%10; break;}
            n/=10;
        }
        if (a==0) {System.out.println("NO");} else {System.out.println(a);}
    }
}