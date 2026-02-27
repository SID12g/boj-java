package bronze;

import java.util.Scanner;

public class b2_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = a*b*c;
        int[] arr = new int[11];
        String s = Integer.toString(k);
        for(int i = 0; i<s.length(); i++) {
            char l = s.charAt(i);
            int p = (int) l - '0';
            arr[p]++;
        }
        for(int i =0; i<10; i++) {
            System.out.println(arr[i]);
        }
    }
}
