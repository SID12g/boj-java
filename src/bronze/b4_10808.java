package bronze;


import java.util.Scanner;
public class b4_10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] arr = new int[26];
        for(int i = 0; i<s.length();i++) {
            char k = s.charAt(i);
            arr[k-'a']++;
        }
        for(int i =0; i<26; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
