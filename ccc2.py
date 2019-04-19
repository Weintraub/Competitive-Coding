def zip(*iterables):
    # zip('ABCD', 'xy') --> Ax By
    sentinel = object()
    iterators = [iter(it) for it in iterables]
    while iterators:
        result = []
        for it in iterators:
            elem = next(it, sentinel)
            if elem is sentinel:
                return
            result.append(elem)
        yield tuple(result)
        
def checker(data,n):
    answer = True
    for i in range(0,n-1):
        for j in range(0,n-1):
            if data[i][j] > data[i][j+1]:
                answer = False
            if data[i][j] > data[i+1][j]:
                answer = False
    return answer

def rotate(data):
    rotated = list(zip(*reversed(data)))
    return rotated
    
def dataprint(data,n):
    for i in range(0,n):
        for j in range(0,n):
            print(data[i][j]," ",sep=' ',end='')
        print()
        
        

days = int(input())
chart = []
for i in range(0,days):
    chart.append([int(i) for i in input().split()])

for i in range(0,4):
    if(checker(chart,days)):
        dataprint(chart,days)
        break
    else:
        chart = rotate(chart)
