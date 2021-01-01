import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 시간 복잡도: O(k) - k는 동전의 개수
 공간 복잡도: O(k)
 사용한 알고리즘: 그리디
 사용한 자료구조: 배열
 https://www.acmicpc.net/problem/5585
 */

public class Main {

    // 0. 사용할 변수 선언
    public static int n, remain, result;
    public static int[] coins = {500, 100, 50, 10, 5, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 입력 및 거스름돈 계산
        n = Integer.parseInt(br.readLine());
        remain = 1000 - n;

        // 2. 큰 동전부터 차례대로 갯수를 계산한다.
        for(int coin: coins) {
            result += (int)(remain / coin);
            remain %= coin;
        }

        // 3. 출력
        System.out.println(result);
    }
}