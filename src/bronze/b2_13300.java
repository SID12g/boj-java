import java.io.*;
import java.util.*;
import java.util.*;
import java.io.*;

public class b2_13300
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[6][2]; // [학년][성별] -> 0여자, 1남자
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // 성별
            int y = Integer.parseInt(st.nextToken()); // 학년
            arr[y-1][x]++;
        }
        // 1. k는 한 방에 지정할 수 있는 최대 인원
        // 2. 같은 성별끼리 배정해야함.
        // 3. 같은 학년 끼리 배정해야 함.

        // k와 n은 1,000 즉 10^3을 넘지 않음.
        // y는 최대 6, x는 최대 2개 이므로 완전 탐색을 돌려도 시간 초과가 생기지 않음.
        // 완전 탐색 하면서 각 학년 및 성별의 수로 나눈 몫 + 나머지가 있으면 1합 아닐시 1합 안함.
        int room = 0;
        for(int i = 0; i<6; i++) {
            for(int j = 0; j<2; j++) {
                int p = arr[i][j] / k;
                int q = arr[i][j] % k;
                if(q != 0) {
                    room += p+1;
                } else {
                    room+=p;
                }
            }
        }
        System.out.println(room);
    }
}
