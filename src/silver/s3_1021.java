package silver;

import java.util.*;
import java.io.*;

public class s3_1021 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());
        int sum = 0; // 2, 3 연산 횟수 합
        st = new StringTokenizer(br.readLine());
        int[] goal = new int[cnt];
        LinkedList<Integer> deque = new LinkedList<>();

        for(int i = 0; i<n; i++) {
            deque.offer(i+1);
        }

        for(int i = 0; i<cnt; i++){
            goal[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<cnt; i++) {
            int target_idx = deque.indexOf(goal[i]);
            int point;
            if(deque.size() % 2 == 0) {
                point = deque.size() / 2 - 1;
            } else {
                point = deque.size() / 2;
            }

            if(target_idx <= point) {
                for(int j = 0; j<target_idx; j++) {
                    int pop = deque.pollFirst();
                    deque.offer(pop);
                    sum++;
                }
            } else {
                for(int j = 0; j<deque.size()-target_idx; j++) {
                    int pop = deque.pollLast();
                    deque.offerFirst(pop);
                    sum++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(sum);
    }
}
