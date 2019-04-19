villages = int(input())
towns = []
for i in range(0,villages):
    towns.append(int(input()))
towns.sort()
distances = []

for i in range(1,villages-1):
    left = towns[i-1]
    middle = towns[i]
    right = towns[i+1]
    diff = left+middle
    distanceLeft = diff/2 - left
    diff = middle + right
    distanceRight = diff/2 -middle
    total = distanceRight + distanceLeft
    distances.append(total)
distances.sort()
print(distances[0])
