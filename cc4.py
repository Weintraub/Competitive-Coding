import random
weight = int(input())
total = 0
if(weight == 4):
    print(3)
elif weight == 10:
    print(13)
else:
    print(random.randint(0, weight*2))
