package silver;

import java.util.Scanner;

public class s4_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        int cnt = 0;
        for(int i = 0; i<k; i++) {
            int x = sc.nextInt();
            if(x == 0) {
                if(cnt != 0){
                    arr[cnt - 1] = 0;
                    cnt--;
                }
            } else {
                arr[cnt] = x;
                cnt++;
            }
        }
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
