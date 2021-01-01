#include <iostream>
#define max_coins 6
#define max_value 1000

/*
 시간 복잡도: O(k) - k는 동전의 개수
 공간 복잡도: O(k)
 사용한 알고리즘: 그리디
 사용한 자료구조: 배열
 https://www.acmicpc.net/problem/5585
 */


using namespace std;

// 0. 사용할 변수 선언
int n, coins[max_coins] = {500, 100, 50, 10, 5, 1}, remain, result;


int main() {
    // 1. 입력 및 거스름돈 계산
    scanf("%d", &n);
    remain = max_value - n;
    
    
    // 2. 큰 동전부터 차례대로 갯수를 계산한다.
    for(int i=0; i<max_coins; i++) {
        result += (int)(remain / coins[i]);
        remain %= coins[i];
    }

    
    // 3. 출력
    printf("%d\n", result);
}
