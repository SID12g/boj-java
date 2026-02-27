package bronze;

import java.util.Scanner;

public class b3_1267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[20];
        for(int i = 0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        int y = 0, m = 0;
        for(int i = 0; i<n; i++) {
            y+=getY(arr[i]);
        }
        for(int i = 0; i<n; i++) {
            m+=getM(arr[i]);
        }
        if(y > m) {
            System.out.print("M ");
            System.out.println(m);
        } else if(m>y) {
            System.out.print("Y ");
            System.out.println(y);
        } else {
            System.out.print("Y M ");
            System.out.println(m);
        }
    }

    public static int getY(int a){
        int p = a/30;
        return 10*p + 10;
    }

    public static int getM(int a){
        int p = a/60;
        return 15*p + 15;
    }
}
