package module1;
import java.util.Locale;
import java.util.Scanner;
public class less5_1_4 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int t = in.nextInt();
        if (((t<1000)&&(t>99)||(t>-1000)&&(t<-99))&&(t>0)&&(t%5==0)) {
            System.out.println("true");
        } else System.out.println("false");
    }
}