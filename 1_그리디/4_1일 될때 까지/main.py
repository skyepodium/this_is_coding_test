"""
시간 복잡도: O(logn / logk) - n을 k로 얼마나 나눌 수 있는가에 달려있다.
공간 복잡도: O(1)
사용한 알고리즘: 그리디
사용한 자료구조: ..
"""
# 0. 사용할 변수 선언
result = 0

# 1. 입력
n, k = map(int, input().split())

while True:
    print(1)
    # 2. 1을 num만큼 빼준다.
    num = (n // k) * k
    result += n - num
    n = num

    # 3. k로 n을 나눌 수 없으면 탈출한다.
    if k > n:
        break

    # 4. n을 k로 나눠준다.
    n = n // k
    result += 1

# 5. 남은 1을 빼준다.
result += n - 1

# 6. 출력
print(result)

"""
25 5
2

17 4
3

25 3
6
"""