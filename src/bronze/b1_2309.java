package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class b1_2309 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int sum = 0;
        int a = 0, b= 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<9; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        for(int i = 0; i<9; i++) {
            for(int j = 0; j<9; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    a = arr[i];
                    b = arr[j];
                }
            }
        }
        Arrays.sort(arr);
        for(int i = 0; i<9; i++) {
            if(arr[i] != a && arr[i] != b) {
                System.out.println(arr[i]);
            }
        }
    }
}
