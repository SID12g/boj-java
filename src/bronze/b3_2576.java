package bronze;

import java.util.Scanner;

public class b3_2576 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int[] arr2 = new int[7];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int min = 100;
        for(int i =0; i<7; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] % 2 != 0) {
                sum += arr[i];
                arr2[i] = arr[i];
            }
            else arr[i] = 100;
        }

        for(int i = 0; i<7; i++) {
            if(min>arr[i]) min=arr[i];
        }
        if(min != 100) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
