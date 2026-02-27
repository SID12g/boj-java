package bronze;

import java.util.Scanner;

public class b5_10871 {
    static void main() {
        int n, x, k;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x = scanner.nextInt();
        for(int i = 0; i<n; i++) {
            k = scanner.nextInt();
            if(k < x) {
                System.out.println(k);
            }
        }
    }
}
