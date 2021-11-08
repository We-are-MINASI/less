package module1;
import java.util.Scanner;
public class less8_1_1 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int t=0,y=0;
        int n = in.nextInt();
        int [] a = new int [n];
        for  (int i=0;i<n;i++) {
            a[i] = in.nextInt();
        }
        int x= in.nextInt();
        for  (int i=0;i<n;i++) {
            if (a[i]==x) {t=1; y=i; break;}
        }
        if (t==1) {System.out.println(y+1);} else {System.out.println("NO");}
    }
}

