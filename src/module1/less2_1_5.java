package module1;

import java.util.Scanner;
public class less2_1_5 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int h=a/3600,m=(a-h*3600)/60,s=a-h*3600-m*60;
        while(h>=24){h=h-24;}
        if(m>9&&s<10){System.out.println(h+":"+m+":0"+s);} else{if(m<10&&s>9){System.out.println(h+":0"+m+":"+s);} else{if(m<10&&s<10){System.out.println(h+":0"+m+":0"+s);}else{System.out.println(h+":"+m+":"+s);}}}
    }
}
//осторожно говнокод line 10