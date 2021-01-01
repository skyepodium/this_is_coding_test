import java.io.*;
import java.util.*;

/*
 시간 복잡도: O(nlogn)
 공간 복잡도: O(n)
 사용한 알고리즘: STL sort, 그리디
 사용한 자료구조: 배열
 */

public class Main {

    public static StringTokenizer st;
    public static int n, m, k, a[], first, second, first_cnt, second_cnt, result;

    public static void main(String[] args) throws IOException {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 정렬
        Arrays.sort(a);

        // 3. first - 제일 큰수, second - 그 다음으로 큰 수
        first = a[n-1];
        second = a[n-2];

        // 4. first_cnt 는 큰 수가 더해지는 횟수
        first_cnt = (m / (k+1)) * k;
        first_cnt += m % (k+1);

        // 5. second_cnt 는 작은 수가 더해지는 횟수
        second_cnt = m - first_cnt;
        result = first * first_cnt + second * second_cnt;

        // 6. 출력
        System.out.println(result);
    }
}
/*
5 8 3
2 4 5 4 6
 */