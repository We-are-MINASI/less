package module1;
import java.util.Locale;
import java.util.Scanner;
public class less5_1_3 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double t = in.nextDouble();
        if (((t >= -2) && (t <= 3))||((t>=6)&&(t<=9))) {
            System.out.println("false");
        } else System.out.println("true");
    }
}