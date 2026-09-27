l1=[]
max_size=6
if len(l1)<max_size:
    l1.append(5)
print(l1)
if len(l1)<max_size:
    l1.append(15)
print(l1)
if len(l1)<max_size:
    l1.append(25)
print(l1)
if len(l1)>0:
    l1.pop()
print(l1)
if len(l1)<max_size:
    l1.append(35)
print(l1)
if len(l1)<max_size:
    l1.append(45)
print(l1)
if len(l1)>0:
    l1.pop()
print(l1)
if len(l1)<max_size:
    l1.append(55)
print(l1)
if len(l1)>0:
    print(l1[-1])
if len(l1)<max_size:
    l1.append(65)
print(l1)