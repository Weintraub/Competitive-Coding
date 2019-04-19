from math import sqrt
for i in range(int(input())):
    myContestants, myBobScore = [int(i) for i in input().split()]
    myCompetitors = [int(i) for i in input().split()]
    myLose = 0
    for i in myCompetitors:
        if myBobScore < i:
            myLose += 1
    myWin = "%.2f" % (sqrt(myContestants-myLose)*100)
    
    print('Bob wins $' + str(myWin),'at IOI!')
    
