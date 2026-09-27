l1=[12,25,38,41,56]
l2=[12,25,38,41,60]
while len(l1)>0:
    p1=l1.pop()
    p2=l2.pop()
    print(p1, p2)
    if p1==p2:
        print("Equal")
    else:
        print("Not Equal")