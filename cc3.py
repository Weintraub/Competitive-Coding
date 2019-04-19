def 
def route(factory,dest,steps,start):
    return 0
def goals(chart,rows,cols):
    goals = []
    for i in range(0,rows):
        for j in range(0,cols):
            if chart[i][j] == ".":
                goals.append((i,j))
    return goals
def start(chart,rows,cols):
    goals = []
    for i in range(0,rows):
        for j in range(0,cols):
            if chart[i][j] == "S":
                goals.append((i,j))
    return goals


rows, cols = [int(i) for i in input().split()]
factory = []
for i in range(rows):
    factory.append(list(input()))
#print(factory)
dest = goals(factory,rows,cols)
position = start(factory,rows,cols)[0]
for i in dest:
    print(route(factory,i,0,position))
#comment je peux faire de coding en francais 

#j'ai fait du deca#
