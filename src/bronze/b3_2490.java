package bronze;

import java.util.Scanner;

public class b3_2490 {
    public static void main(String[] args) {
        int arr1[] = new int[4];
        int arr2[] = new int[4];
        int arr3[] = new int[4];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<4; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println(getValue(arr1));
        for(int i = 0; 4 > i; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.println(getValue(arr2));
        for(int i = 0; i<4; i++) {
            arr3[i] = scanner.nextInt();
        }
        System.out.println(getValue(arr3));
    }

    public static String getValue(int[] arr){
        int c0 = 0;
        for(int i = 0; i<4; i++) {
            if(arr[i] == 0) c0++;
        }
        if(c0 == 0) return "E";
        else if(c0 == 4) return "D";
        else if(c0 == 3) return "C";
        else if (c0 == 2) return "B";
        else return "A";
    }
}
