def plusplus(x1,y1,x2,y2):
    if x1 - x2 == y1 - y2:return True
    else: return False
    
def plusminus(x1,y1,x2,y2):
    if (x1 - x2) == (y1 - y2):return True
    else: return False
    
def diagnol(queenx,queeny,spotx,spoty):
    if plusplus(queenx,queeny,spotx,spoty):
        return True
    elif plusminus(queenx,queeny,spotx,spoty):
        return True
    else: return False

def vertical(y1,y2):
    if y1 == y2:return True
    else: return False
def horizontal(x1,x2):
    if x1 == x2:return True
    else: return False
    
myBoardLength, myQuestions = [int(i) for i in input().split()]
myTotalSpots = myBoardLength ** 2
myGrid = [False]*myTotalSpots


for i in range(myQuestions):
    myQueenSpot = [int(i) for i in input().split()]
    for x in range(myBoardLength):
        for y in range(myBoardLength):
            if myGrid[x*6+y] == True:
                continue
            if vertical(myQueenSpot[1],x) or horizontal(myQueenSpot[0],y) or diagnol(myQueenSpot[0], myQueenSpot[1], x, y):
                myGrid[x*6+y] = True

for i in range(6):
    print(myGrid[i:i+6])

 
myTaken = 0
for x in range(myBoardLength):
    for y in range(myBoardLength):
        if myGrid[x*6+y] == True:
            myTaken += 1
print(myTaken)

