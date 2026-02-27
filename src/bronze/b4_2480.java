package bronze;

import java.util.Scanner;

public class b4_2480 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int p;
        if(a == b && b == c) {
            p = 10000+a*1000;
        } else if (a == b || b == c) {
            p = 1000 + b* 100;
        } else if (a==c || b == c) {
            p=1000+c*100;
        } else if (a==b || a==c) {
            p=1000+a*100;
        }else {
            p=returnMax(a, returnMax(b, c))*100;
        }
        System.out.println(p);
    }
    public static int returnMax(int a, int b) {
        if(a>b) return a;
        else return b;
    }
}
