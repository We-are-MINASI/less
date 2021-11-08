package module1;
import java.util.Scanner;
public class less7_1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int s =25;
        int d=0;
        while (s<=a) {
            if (s%2==0){
                d+=s;
                s+=2;
            } else {s++;}
        }
        System.out.println(d);
    }
}