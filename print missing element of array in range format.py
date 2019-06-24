LINK -> https://www.youtube.com/watch?v=qjNVJTUge7s&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=16
Code ->

from array import array
a=array('i',[88,105,3,2,200,0,10,60])
a=sorted([i for i in a if i<=99])
if a[0]!=0:
    j = [k for k in range(0,a[0])]
    if len(j) == 1:print(j[0])
    else:print(j[0], '-', j[-1])
for i in range(len(a)-1):
    if a[i+1]-a[i]>1:
        j=[k for k in range(a[i]+1,a[i+1])]
        if len(j)==1:print(j[0])
        else:print(j[0],'-',j[-1])
if a[-1]!=99:
    j = [k for k in range(a[-1]+1,100)]
    if len(j) == 1:print(j[0])
    else:print(j[0], '-', j[-1])