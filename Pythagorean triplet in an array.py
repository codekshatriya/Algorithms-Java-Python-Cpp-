from array import array
a=array('i',[-9,-8,-7,-6,-5,-4,-3,-2,-1,3,4,5])
a=sorted(a)
j=[ i*i for i in a]
for i in range(len(j)-2):
    if j[i]+j[i+1]==j[i+2]:
        print(a[i],a[i+1],a[i+2]) #code to find pythagorean triplet in an array; x*x+y*y=z*z;3*3+4*4=5*5
        break