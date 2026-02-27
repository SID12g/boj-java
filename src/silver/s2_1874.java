package silver;

import java.util.Scanner;

public class s2_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stack = new int[n];
        int top = -1;
        int last = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++) {
            int k = sc.nextInt();
            if(k>last) {
                for(int j = last+1; j<=k; j++) {
                    stack[++top] = j;
                    sb.append("+\n");
                }
                last = k;
            }
            if(stack[top] == k) {
                top --;
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
