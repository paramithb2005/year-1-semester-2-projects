l1=[1,2,3,4,5,6,7,8]
print("The original list is:", l1)
index=int(input("Enter the index of the element you want to delete: "))
for i in range(index,len(l1)-1):
    l1[i]=l1[i+1]
l1.pop()
print("The updated list is:", l1)