class node:
    def __init__(self,head):
        self.head=head
        self.next=None
class linkedlist:      #get square of numbers using Linkedlists
    def __init__(self):
        self.start=None
    def prinnt(self):
        if self.start==None:print('List is empty\t')
        else:
            last=self.start
            while last!=None:
                print(last.head**2,end=' ')
                last=last.next
    def push(self,value):    #pushing or adding new node at the end of list;where next is None
        newnod=node(value)
        if self.start==None:
            self.start=newnod
        else:
            temp=self.start
            while temp.next!=None:temp=temp.next
            temp.next=newnod
obj=linkedlist()
for i in input('Enter space seperated numbers\t').split(' '):
    obj.push(int(i))
obj.prinnt()