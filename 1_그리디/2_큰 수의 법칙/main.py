"""
 시간 복잡도: O(nlogn)
 공간 복잡도: O(n)
 사용한 알고리즘: STL sort, 그리디
 사용한 자료구조: 배열
"""
# 1. 입력
n, m, k = map(int, input().split())
a = list(map(int, input().split()))

# 2. 오름 차순 정렬
a.sort(reverse=True)

# 3. first - 제일 큰수, second - 그 다음으로 큰 수
first = a[0]
second = a[1]

# 4. first_cnt 는 큰 수가 더해지는 횟수
first_cnt = int((m / (k+1)) * k) + (m % (k+1))
# 5. second_cnt 는 작은 수가 더해지는 횟수
second_cnt = m - first_cnt

result = first * first_cnt + second * second_cnt

# 6. 출력
print(result)