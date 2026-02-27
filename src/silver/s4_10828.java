package silver;

import java.util.Scanner;

public class s4_10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int[] arr = new int[100000];
        for(int i = 0; i<n; i++) {
            String cmd = sc.next();
            if(cmd.equals("push")) {
                arr[cnt] = sc.nextInt();
                cnt++;
            } else if(cmd.equals("pop")){
                if(cnt !=0 ) {
                    System.out.println(arr[cnt-1]);
                    arr[cnt-1] = 0;
                    cnt--;
                }
                else System.out.println(-1);;
            } else if(cmd.equals("size")){
                System.out.println(cnt);
            } else if(cmd.equals("empty")) {
                if(cnt == 0) System.out.println(1);
                else System.out.println(0);
            } else if(cmd.equals("top")) {
                if(cnt!=0) System.out.println(arr[cnt-1]);
                else System.out.println(-1);
            }
        }
    }
}
