package module1;
import java.util.Scanner;
public class less7_1_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c=0,s=1;
        while (a>0){
            a/=2;c++;
        }
        System.out.println(c);
    }
}