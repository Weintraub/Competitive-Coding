new_list =[] # A list which holds the numbers
for a in range(100,1000):
    for b in str(a):
        if int(b) % 2 == 0:
            break
    else:
        # only executed if the loop wasn't broken out of
        new_list.append(a)


print(sum(new_list))
