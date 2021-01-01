#include <iostream>
#include <algorithm>

#define max_int 1001

/*
 시간 복잡도: O(nlogn)
 공간 복잡도: O(n)
 사용한 알고리즘: STL sort, 그리디
 사용한 자료구조: 배열
 */

using namespace std;


int n, m, k, a[max_int], first, second, first_cnt, second_cnt, result;

// 내림차순 정렬하기 위한 함수
bool cmp(const int &a, const int &b) {
    return a > b;
}

int main () {
    // 1. 입력
    scanf("%d %d %d", &n, &m, &k);
    
    for(int i=0; i<n; i++) {
        scanf("%d", &a[i]);
    }
    
    
    // 2. 내림 차순 정렬
    sort(a, a + n, cmp);
    
    
    // 3. first - 제일 큰수, second - 그 다음으로 큰 수
    first = a[0];
    second = a[1];
    
    
    // 4. first_cnt 는 큰 수가 더해지는 횟수
    first_cnt = (m / (k+1)) * k;
    first_cnt += m % (k+1);
    
    
    // 5. second_cnt 는 작은 수가 더해지는 횟수
    second_cnt = m - first_cnt;
    
    result = first * first_cnt + second * second_cnt;

    
    // 6. 출력
    printf("%d\n", result);
}
/*
5 8 3
2 4 5 4 6
 */
