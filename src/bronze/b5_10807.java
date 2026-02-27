package bronze;

import java.util.Scanner;

public class b5_10807 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[300];
        for(int i = 0; i<n; i++) {
            int k = sc.nextInt();
            if(k == 0) {
                arr[201] ++;
            } else {
                arr[k+100]++;
            }
        }
        int v = sc.nextInt();
        if(v == 0) System.out.println(arr[201]);
        else System.out.println(arr[v+100]);
    }
}
