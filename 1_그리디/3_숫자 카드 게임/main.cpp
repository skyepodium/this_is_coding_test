#include <iostream>

/*
시간 복잡도: O(n*m)
공간 복잡도: O(1)
사용한 알고리즘: 그리디
사용한 자료구조: ..
*/

#define max_value 10001

using namespace std;

int n, m, num, min_value, result;

int min(int a, int b) {
    return a < b ? a : b;
}

int max(int a, int b) {
    return a > b ? a : b;
}

int main() {
    // 1. 입력
    scanf("%d %d", &n, &m);
    
    for(int i=0; i<n; i++) {

        min_value = max_value;
        
        for(int j=0; j<m; j++) {
            scanf("%d", &num);

            // 2. 최소값 갱신
            min_value = min(min_value, num);
        }

        // 3. 최대값 갱신
        result = max(result, min_value);
    }
    
    // 4. 출력
    printf("%d\n", result);
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
