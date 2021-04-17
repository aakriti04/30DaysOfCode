#!/bin/python3

import sys


S = input().strip()

try:
    n = int(S)
    print(n)
except ValueError as err:
    print("Bad String")
    
