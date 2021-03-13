#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))
    
    i=0 
    j=len(arr)-1
    
    while(i<=j):
        temp =arr[i]
        arr[i]=arr[j]
        arr[j]=temp
        i+=1
        j-=1
    print(*arr)
        
    

