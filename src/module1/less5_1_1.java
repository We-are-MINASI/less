package module1;
import java.util.Locale;
import java.util.Scanner;
public class less5_1_1 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double t = in.nextDouble();
        if ((t >= 3) && (t <= 8)) {
            System.out.println("true");
        } else System.out.println("false");
    }
}