class invalid:  #Python class to check whether parentheses,curly bracs,square bracs are valid or not
    def checker(self,stri):
        par=cur=sqr=0
        for i in stri:
            if i=='(':par+=1
            elif i=='{':cur+=1
            elif i=='[':sqr+=1
            elif i==')':
                par-=1
                if par<0:return 'Invalid'
            elif i == '}':
                cur -= 1
                if cur < 0: return 'Invalid'
            elif i == ']':
                sqr -= 1
                if sqr< 0: return 'Invalid'
        if par==cur==sqr==0:return 'Valid'
        else:return 'Invalid'
objec=invalid()
print(objec.checker(input('Enter string\t')))


