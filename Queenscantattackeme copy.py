def plusplus(x1,y1,x2,y2):
    if x1 - x2 == y1 - y2:return True
    else:
        print(x1,y1,x2,y2)
        return False
    
def plusminus(x1,y1,x2,y2):
    if (x1 - x2) == (y1 - y2):return True
    else:
        print(x1,y1,x2,y2)
        return False
    
def diagnol(queenx,queeny,spotx,spoty):
    if plusplus(queenx,queeny,spotx,spoty) or plusminus(queenx,queeny,spotx,spoty): return True
    else: return False

def lines(y1,y2,x1,x2):
    if y1 == y2 or x1 == x:return True
    else: return False
    
    
myBoardLength, myQuestions = [int(i) for i in input().split()]
myTotalSpots = myBoardLength ** 2
myGrid = []
for i in range(myBoardLength):
    myGrid.append([False]*myBoardLength)


for i in range(myQuestions):
    myQueenSpot = [int(i) for i in input().split()]
    for x in range(myBoardLength):
        for y in range(myBoardLength):

            if myGrid[x][y] == True:
                continue
            if lines(myQueenSpot[0]-1,y,myQueenSpot[1]-1,x) or diagnol(myQueenSpot[0]-1, myQueenSpot[1]-1, x, y):
                myGrid[x][y] = True

'''
#Check the Grid
for i in range(6):
    print(myGrid[i])
'''

myTaken = 0
for x in range(myBoardLength):
    for y in range(myBoardLength):
        if myGrid[x][y] == True:
            myTaken += 1
print(myTaken)
