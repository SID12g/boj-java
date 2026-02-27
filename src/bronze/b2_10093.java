package bronze;

import java.util.Scanner;

public class b2_10093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        if(a==b) {
            System.out.println(0);
            return;
        }
        long temp = 0;
        if(a>b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(b-a-1);
        for(long i = a+1; i<b; i++){
            System.out.print(i+" ");
        }
    }
}
