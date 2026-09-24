l1=[1,2,3,4,5,6,7]
index=int(input("Enter the index of the element you want to add: "))
position=int(input("Enter the position of the element you want to replace: "))
l1.append(0)
for i in  range(len(l1)-1, position, -1):
    l1[i] = l1[i-1]
l1[position] = index
print("The updated list is:", l1)