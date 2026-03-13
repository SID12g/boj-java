import java.util.*;
import java.io.*;

public class s3_2559
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<n-k+1; i++) {
            int sum = 0;
            for(int j = i; j<i+k; j++) {
                sum+=arr[j];
            }
            max = Math.max(sum, max);
        }

        System.out.print(max);
    }
}
