# Enter your code here. Read input from STDIN. Print output to STDOUT
dates=[]
months=[]
years=[]
while True:
    try:
        s = input()
        dates.append(int(s.split(" ")[0]))
        months.append(int(s.split(" ")[1]))
        years.append(int(s.split(" ")[2]))
    except EOFError:
        break

returnDate = dates[0]
dueDate = dates[1]
returnMonth = months[0]
dueMonth = months[1]
returnYear =years[0]
dueYear = years[1]
fine = 0
if returnYear>dueYear:
    fine=10000
elif returnYear==dueYear:
    if returnMonth<=dueMonth and returnDate>dueDate:
        fine =  15 * (returnDate-dueDate)
    elif returnMonth>dueMonth:
        fine = 500 *(returnMonth -dueMonth)
print(fine)
        

