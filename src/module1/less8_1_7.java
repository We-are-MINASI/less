package module1;
import java.util.Scanner;
public class less8_1_7 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [] a = new int [n];
        for (int i=0;i<n;i++) {
            a[i]=in.nextInt();
            if (a[i]<0) {System.out.print(a[i] + " ");}
        }
        for (int i=0;i<n;i++) {
            if (a[i]>0) {System.out.print(a[i]+" ");}
        }
    }
}
