package module1;
import java.util.Scanner;
public class less6_1_2 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        int maxx=Math.max(a,Math.max(b,c));
        int min=Math.min(a,Math.min(b,c));
        int sr=a+b+c-maxx-min;
        System.out.println( min + " " + sr + " " +  maxx);
    }
}