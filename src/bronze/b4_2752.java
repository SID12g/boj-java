package bronze;

import java.util.Scanner;

public class b4_2752 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++) {
            arr[i]= scanner.nextInt();
        }

        int max = returnMax(arr[0], returnMax(arr[1], arr[2]));
        int min = returnMin(arr[0], returnMin(arr[1], arr[2]));
        int mid = 0;
        for(int i = 0; i<3; i++) {
            if(arr[i] != max && arr[i] != min) {
                mid = arr[i];
            }
        }
        System.out.println(min + " " + mid + " " + max);
    }

    public static int returnMax(int a, int b){
        if(a>b) return a;
        else return b;
    }

    public static int returnMin(int a, int b) {
        if(a>b) return b;
        else return a;
    }
}

