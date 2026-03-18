package gold;

import java.io.*;
import java.util.*;

public class g5_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++) {
            int[] input = {Integer.parseInt(st.nextToken()), i+1};
            if(i == 0) {
                sb.append(0+" ");
                stack.push(input);
            } else {
                while(!stack.isEmpty()) {
                    if(stack.peek()[0] >= input[0]) {
                        sb.append(stack.peek()[1]+" ");
                        stack.push(input);
                        break;
                    } else {
                       stack.pop();
                       if(stack.isEmpty()) {
                           sb.append(0+" ");
                           stack.push(input);
                           break;
                       }
                    }
                }
            }
        }
        System.out.print(sb);
    }
}