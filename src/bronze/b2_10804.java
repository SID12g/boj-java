package bronze;

import java.util.Scanner;

public class b2_10804 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int a, b;
        for(int i = 0; i<10; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            for (int j = 0; j <= (b - a) / 2; j++) {
                int temp = arr[a + j];
                arr[a + j] = arr[b - j];
                arr[b - j] = temp;
            }
        }
        for(int l = 1; l<21; l++) {
            System.out.print(arr[l]+" ");
        }
    }
}

