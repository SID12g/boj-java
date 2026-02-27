package silver;

import java.util.Scanner;

public class s5_1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int x = sc.nextInt();
        String s = Integer.toString(x);
        for(int i = 0; i<s.length(); i++) {
            char k = s.charAt(i);
            arr[k-'0'] ++;
        }
        int p = 0;
        int sx = (arr[6] + arr[9] + 1) / 2;
        arr[6] = sx;
        arr[9] = sx;
        for(int i = 0; i<10; i++) {
            if(p<arr[i]) {
                p = arr[i];
            }
        }
        System.out.println(p);
    }
}
