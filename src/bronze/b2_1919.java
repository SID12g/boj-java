package bronze;

import java.util.Scanner;

public class b2_1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i = 0; i<a.length(); i++) {
            char k = a.charAt(i);
            arr1[k-'a']++;
        }
        for(int i = 0; i<b.length(); i++) {
            char k = b.charAt(i);
            arr2[k-'a']++;
        }
        int cnt = 0;
        for(int i = 0; i<26; i++) {
            if(arr1[i]>arr2[i]) {
                cnt+=arr1[i] - arr2[i];
            } else if(arr2[i]>arr1[i]) {
                cnt+=arr2[i]-arr1[i];
            }
        }
        System.out.println(cnt);
    }
}
