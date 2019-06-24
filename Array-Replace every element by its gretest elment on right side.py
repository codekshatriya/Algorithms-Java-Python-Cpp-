LINK -> https://www.youtube.com/watch?v=bLb8e83OK7o&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=8
code ->

from array import array
a=array('i',[16,17,4,3,5,2])
for i in range(len(a)):
    try:a[i]=max(a[i+1:])
    except:a[i]=-1
print(a)
