package module1;
import java.util.Scanner;
public class less8_1_6 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),cnt=0,maxcnt=0,ans=0;
        int [] a = new int [n];
        for (int i =0;i<n;i++) {
            a[i]=in.nextInt();
        }
        if (n!=1){for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                if (a[j]==a[i]) {
                    cnt++;
                }
            }
            if (cnt>maxcnt) {
                maxcnt=cnt;
                ans=a[i];
            }
            cnt=0;
        }
            System.out.println(ans);}
        else {System.out.println(a[0]);}
    }
}
