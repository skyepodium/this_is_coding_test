import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
시간 복잡도: 0(n * m)
공간 복잡도: (1)
사용한 알고리즘: 그리디
사용한 자료구조: ..
*/

public class Main {

    public static StringTokenizer st;
    public static int max_value = 10001;
    public static int n, m, num, min_value, result;
    public static void main(String args[]) throws IOException {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            min_value = max_value;
            for(int j=0; j<m; j++) {
                num = Integer.parseInt(st.nextToken());

                // 2. 최소값 갱신
                min_value = min(min_value, num);
            }

            // 3. 최대값 갱신
            result = max(min_value, result);
        }

        // 4. 출력
        System.out.println(result);

    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}

/*
3 3
3 1 2
4 1 4
2 2 2

2

2 4
7 3 1 8
3 3 3 4

3
 */