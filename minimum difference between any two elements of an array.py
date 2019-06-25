from array import array
a=array('i',[1,19,-4,31,38,25,100])
a=sorted(a);mini=a[1]-a[0]
for i in range(1,len(a)):       #minimum difference between any two elements of an array
    if a[i]-a[i-1]<mini:mini=a[i]-a[i-1]
print(mini)