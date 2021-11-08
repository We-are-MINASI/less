package module1;
import  java.util.Scanner;
public class less8_1_3 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int s=0,t=0,c=0;
        int [] a = new int [n];
        for (int i=0;i<n;i++) {
            a[i]=in.nextInt();
            if (a[i]%2!=0) {
                s+=a[i];t=1;c++;
            }
        }
        double del = (double) s/c;
        if (t!=0) {System.out.printf("%.2f", del);} else {System.out.println("NO");}
    }
}
