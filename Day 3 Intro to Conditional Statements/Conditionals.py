#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    N = int(input())
    if N%2!=0:
        res="Weird"
    else:
        res= "Not Weird" if (N>=2 and N<=5) else "Weird" if (N>=6 and N<=20) else "Not Weird"
    print(res)
