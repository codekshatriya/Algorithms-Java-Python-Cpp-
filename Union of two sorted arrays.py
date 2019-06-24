from array import array
a1=array('i',[1,2,3,4,5,6,7])
a2=array('i',[4,5,6,7,8,9,10])
import itertools
print(set(itertools.chain.from_iterable((a1,a2))))# using itertools, union of two arrays
#aliter (another method)
print(set(a1).union(set(a2)))
#aliter (another method)
print(set(a1)|set(a2))
