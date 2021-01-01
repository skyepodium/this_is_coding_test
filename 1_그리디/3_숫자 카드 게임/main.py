"""
시간 복잡도: O(n * m)
공간 복잡도: O(m)
사용한 알고리즘: 그리디
사용한 자료구조: 리스트
"""
# 1 . 입력
n, m = map(int, input().split())
result = 0
for _ in range(n):
    cards = list(map(int, input().split()))

    # 2. 리스트에서 최소값 찾는다.
    min_card = min(cards)

    # 3. 최소값으로 최대값 갱신
    result = max(result, min_card)

# 4. 출력
print(result)

"""
3 3
3 1 2
4 1 4
2 2 2

2

2 4
7 3 1 8
3 3 3 4

3
"""