#!/bin/python3

import sys

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))
# Write Your Code Here

numOfSwaps = 0
for i in range(n):
    for j in range(n-1):
        if a[j]>a[j+1]:
            temp = a[j]
            a[j] = a[j+1]
            a[j+1] = temp
            numOfSwaps+=1
    if numOfSwaps ==0:
        break

print(f"Array is sorted in {numOfSwaps} swaps.")
print(f"First Element: {a[0]}")
print(f"Last Element: {a[n-1]}")
