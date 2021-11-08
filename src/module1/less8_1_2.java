package module1;
import java.util.Scanner;
public class less8_1_2 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int s=0,t=0;
        int n = in.nextInt();
        int [] a = new int [n];
        for  (int i=0;i<n;i++) {
            a[i] = in.nextInt();
            if (a[i]%2==0){s+=a[i];t=1;}
        }
        if (t==1) {System.out.println(s);} else {System.out.println("NO");}
    }
}
