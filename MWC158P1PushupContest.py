def missing_elements(L):
    start, end = L[0], L[-1]
    return sorted(set(range(start, end + 1)).difference(L))
myPushups = []
for i in range(int(input())-1):
    myPushups.append(int(input()))
print(missing_elements(myPushups)[0])
