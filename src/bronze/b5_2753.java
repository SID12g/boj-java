package bronze;

import java.util.Scanner;

public class b5_2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = 0;
        if(x % 4 == 0) {
            if(x % 100 != 0 || x % 400 == 0) {
                result = 1;
            }
        }
        System.out.println(result);
    }
}
