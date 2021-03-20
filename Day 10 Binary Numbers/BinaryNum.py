#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())
    num = n
    res=0
    while(num >0):
        rem=num%2;
        res= res *10+ rem
        num=num//2
    arr = []
    s=""

    while(res>0):
        dig=res%10
        if dig==1:
            s+=str(dig)
        else:
            arr.append(len(s))
            s=""
        if (res//10==0):
            arr.append(len(s))
            
        res=res//10
    print(max(arr))
            
    
