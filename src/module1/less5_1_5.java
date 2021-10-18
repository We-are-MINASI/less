package module1;
import java.util.Scanner;
public class less5_1_5 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int x=0,y=0;
        if ((a==-b)||(a==-c)||(a==-d)||(b==-c)||(b==-d)||(c==-d)){
            y=1;
        }
        if (x==1||y==1) {
            System.out.println("true");
        } else {System.out.println("false");}
    }
}
//осторожно лютый говнокод!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!