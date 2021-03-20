# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input())
phoneBook = {}
for _ in range(n):
    inp = input()
    name = inp.split(" ")[0]
    num = int(inp.split(" ")[1])
    phoneBook[name] = num
inps=[]
while True:
    try :
        line = input()
        inps.append(line)
    except EOFError:
        break;

for inp in inps:   
    if inp in phoneBook:
        print(f"{inp}={phoneBook[inp]}")
    else:
        print("Not found")
    

    
