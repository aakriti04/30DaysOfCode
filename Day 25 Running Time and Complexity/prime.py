# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
def isPrime(ele):
    prime=True
    if ele == 1:
        prime=False
    else:
        for i in range(2,int(math.sqrt(ele))+1):
            if ele %i==0:
                prime= False
                break
    if prime:
        print("Prime")
    else:
        print("Not prime")    



T= int(input())
arr=[]
for i in range(T):
    arr.append(int(input()))
    
for i in range(T):
    isPrime(arr[i])
    