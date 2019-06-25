class node:
    def __init__(self,data):
        self.data=data
        self.next=None
class Linkedlist:
    def __init__(self):
        self.start=None
    def viewlist(self):
        if self.start==None:print('List is empty')
        else:
            temp=self.start
            while temp!=None:print(temp.data,sep=' ');temp=temp.next
    def delfirst(self):
        if self.start==None:print('List is empty')
        else:self.start=self.start.next
    def insertlast(self,valu):
        newnod=node(valu)
        if self.start==None:
            self.start=newnod
        else:
            temp=self.start
            while temp.next!=None:temp=temp.next
            temp.next=newnod
mylist=Linkedlist()
for i in range(1,5):
    mylist.insertlast(10*i)
mylist.viewlist()
print()
mylist.delfirst()
mylist.viewlist()
input()
