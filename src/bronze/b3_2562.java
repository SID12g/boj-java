package bronze;

import java.util.Scanner;

public class b3_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int k = 0;
        int v = 0;
        for(int i = 0; i<9; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i]>v) {
                v = arr[i];
                k = i;
            }
        }
        System.out.println(v);
        System.out.println(k+1);
    }
}
