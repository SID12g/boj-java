import java.util.*;
import java.io.*;

class s3_18917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int xor = 0;
        map.put(0, 1);

        for(int i = 0; i < m; i++) {
            String[] parts = br.readLine().split(" ");
            int opt = Integer.parseInt(parts[0]);

            if(opt == 1) {
                int x = Integer.parseInt(parts[1]);

                map.put(x, map.getOrDefault(x, 0) + 1);
                sum += x;
                xor ^= x;

            } else if(opt == 2) {
                int x = Integer.parseInt(parts[1]);

                if(map.getOrDefault(x, 0) > 0) {
                    map.put(x, map.get(x) - 1);
                    sum -= x;
                    xor ^= x;
                }

            } else if(opt == 3) {
                System.out.println(sum);

            } else if(opt == 4) {
                System.out.println(xor);
            }
        }
    }
}
