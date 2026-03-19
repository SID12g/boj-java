package gold;

import java.io.*;
import java.util.*;

public class g5_6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        long sum = 0;
        for(int i = 0; i<n; i++) {
            int h = Integer.parseInt(br.readLine());

            while(!stack.isEmpty() && stack.peek() <= h) {
                stack.pop();
            }
            sum += stack.size();
            stack.push(h);
        }
        System.out.print(sum);
    }
}