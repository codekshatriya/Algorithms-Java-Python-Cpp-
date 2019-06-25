LINK -> https://www.youtube.com/watch?v=Nzm9emAkSCM&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=17
Code ->

from array import array
a=array('i',[1,2,8,10,10,12,19])
a=sorted(a);x=int(input());ceil=True;floor=False
for i in range(len(a)):
    if ceil and a[i]>=x:print('ceil',a[i]);ceil=False;floor=True
    if floor and a[i-1]<=x:print('floor',a[i-1]);break