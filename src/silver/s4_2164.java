package silver;

import java.io.*;
import java.util.*;

public class s4_2164 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1) {
            System.out.println(1);
            return;
        }
        int[] arr = new int[100000];
        int head = 0;
        int tail = n-1;
        int tmp;
        for(int i = 0; i<n; i++) {
            arr[i] = i + 1;
        }
        while(head<tail) {
            head++;
            if(head == tail) break;
            tmp = arr[head];
            head++;
            arr[tail+1] = tmp;
            tail++;
        }
        System.out.println(arr[head]);
    }
}
