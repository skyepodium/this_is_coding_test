import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 시간 복잡도: O(logn / logk) - n을 k로 얼마나 나눌 수 있는가에 달려있다.
 공간 복잡도: O(1)
 사용한 알고리즘: 그리디
 사용한 자료구조: ..
 */

public class Main {

    // 0. 사용할 변수 선언
    public static StringTokenizer st;
    public static int n, k, num, result;

    public static void main(String args[]) throws IOException {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        while(true) {
            // 2. 1을 num만큼 빼준다.
            num = (n / k) * k;
            result += n - num;
            n = num;

            // 3. k로 n을 나눌 수 없으면 탈출한다.
            if (k > n) break;

            // 4. n을 k로 나눠준다.
            n = n / k;
            result++;
        }

        // 5. 남은 1을 빼준다.
        result += n - 1;

        // 6. 출력
        System.out.println(result);
    }
}