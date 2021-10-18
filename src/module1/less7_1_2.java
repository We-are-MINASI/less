package module1;
import java.util.Scanner;
public class less7_1_2 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 0;
        if (a>10){c=c+a;}
        while (a%5!=0){
            a = in.nextInt();
            if (a>10){c=c+a;}
        }
        System.out.println(c);
    }
}
