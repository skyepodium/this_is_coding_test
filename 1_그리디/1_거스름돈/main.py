"""
시간 복잡도: O(k) - k는 동전의 개수
공간 복잡도: O(k)
사용한 알고리즘: 그리디
사용한 자료구조: 튜플
https://www.acmicpc.net/problem/5585
"""
# 0. 사용할 변수 선언
coins = 500, 100, 50, 10, 5, 1
result = 0


# 1. 입력 및 거스름돈 계산
n = int(input())
remain = 1000 - n


# 2. 큰 동전부터 차례대로 갯수를 계산한다.
for coin in coins:
    result += remain // coin
    remain = remain % coin


# 3. 출력
print(result)
