LINK ->	https://www.geeksforgeeks.org/equilibrium-index-of-an-array/

CODE ->

a=[-7, 1, 5, 1,9, -4, 3, 0,1]
for i in range(len(a)):
    if sum(a[:i])==sum(a[i+1:]):
        print(i)
        break
