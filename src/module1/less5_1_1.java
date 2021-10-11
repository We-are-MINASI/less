package module1;
import java.util.Scanner;
public class less5_1_1 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if ((t >= 3) && (t <= 8)) {
            System.out.println("true");
        } else System.out.println("false");
    }
}