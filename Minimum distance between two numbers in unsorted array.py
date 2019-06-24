LINK -> https://www.youtube.com/watch?v=hoceGcqQczM&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=4

code ->
    
from array import array
a=array('i',[2,5,3,5,4,4,2,3]);min_dis=0;x=3;y=2
for i in range(len(a)):
    if a[i]==x:
        for j in range(i,len(a)):
            if a[j]==y:
                if j-i<min_dis or min_dis==0:
                    min_dis=j-i
    elif a[i]==y:
        for j in range(i,len(a)):
            if a[j]==x:
                if j-i<min_dis or min_dis==0:
                    min_dis=j-i
print(min_dis)