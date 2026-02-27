package silver;

import java.util.Arrays;
import java.util.Scanner;

public class s3_3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        Arrays.sort(arr);
        int start = 0;
        int end = n-1;
        int cnt = 0;
        while(start < end) {
            if(arr[start] + arr[end] == x) {
                cnt++;
                start ++;
                end --;
            } else if(arr[start] + arr[end] < x) {
                start ++;
            } else {
                end--;
            }
        }
        System.out.println(cnt);
    }
}
