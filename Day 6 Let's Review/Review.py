# Enter your code here. Read input from STDIN. Print output to STDOUT

test_cases =int(input())
str=[]
for i in range(test_cases):
    str.append(input())

for i in range(test_cases):
    even="" 
    odd=""
    for index in range(len(str[i])):
        if (index %2==0):
            even += str[i][index]
        else :
            odd +=  str[i][index]
    print(f"{even} {odd}")
        