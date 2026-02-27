package silver;


import java.io.*;
import java.util.*;

public class s4_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int head = 0;
        int tail = 0;
        for(int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                arr[tail] = x;
                tail++;
            } else if(s.equals("pop")) {
                if(tail - head == 0) {
                    sb.append("-1\n");
                } else {
                    sb.append(arr[head]+"\n");
                    head++;
                }
            } else if(s.equals("size")) {
                sb.append(tail-head+"\n");
            } else if(s.equals("empty")) {
                if(tail-head == 0) sb.append("1\n");
                else sb.append("0\n");
            } else if(s.equals("front")) {
                if(tail-head == 0) sb.append("-1\n");
                else sb.append(arr[head]+"\n");
            } else if(s.equals("back")) {
                if(tail-head == 0) sb.append("-1\n");
                else sb.append(arr[tail-1]+"\n");
            }
        }
        System.out.println(sb.toString());
    }
}
