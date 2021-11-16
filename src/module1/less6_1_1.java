package module1;
import java.util.Scanner;
public class less6_1_1 {
    public static void main (String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        if (n<10 && n>=0) {System.out.println("DIGIT");}
        else if (n>=10 && n <100) {System.out.println("NUM");}
        else {System.out.println("OTHER");}
    }
}
