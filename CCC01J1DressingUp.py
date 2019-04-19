myLength = int(input())
mySpace = myLength - 1
myAnswer = []
for i in range(myLength//2):
    var = '*' *(myLength - mySpace) + ' '*mySpace*2 + '*' *(myLength - mySpace)
    print(var)
    myAnswer.append(var)
    mySpace -= 2
print(myLength*2*'*')
for i in range(myLength//2-1,-1,-1):
    print(myAnswer[i])
    
