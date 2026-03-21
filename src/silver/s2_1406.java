package silver;

import java.util.*;
import java.io.*;

public class s2_1406
{
    public static void main(String[] args) throws IOException
    {
        Deque<Character> stack = new ArrayDeque<Character>();
        Deque<Character> stack2 = new ArrayDeque<Character>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for(int i = 0; i<str.length(); i++) {
            stack.push(str.charAt(i));
        }
        int m = Integer.parseInt(br.readLine());
        for(int i = 0; i<m; i++) {
            String input = br.readLine();
            char c = input.charAt(0);
            switch(c) {
                case 'L': 
                    if(!stack.isEmpty()) {
                        char k = stack.pop();
                        stack2.push(k);
                    }
                    break;
                case 'D':
                    if(!stack2.isEmpty()) {
                        char k = stack2.pop();
                        stack.push(k);
                    }
                    break;
                case 'B':
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case 'P':
                    char k = input.charAt(2);
                    stack.push(k);
                    break;
            }
        }
        while(!stack2.isEmpty()) {
            char k = stack2.pop();
            stack.push(k);
        }
        while(!stack.isEmpty()) {
            char k = stack.pop();
            stack2.push(k);
        }
        for(Character c: stack2) {
            sb.append(c);
        }
        System.out.print(sb);
    }
}
