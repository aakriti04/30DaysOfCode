class Difference:
    def __init__(self, a):
        self.__elements = a

    # Add your code here
    def computeDifference(self):
        newArray=a
        newArray.sort()
        self.maximumDifference=newArray[len(newArray)-1]-newArray[0]

# End of Difference class

_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)