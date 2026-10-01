l1=[35,12,58,21,46,7]
smallest=l1[0]
for i in range(1,len(l1)):
    if l1[i]<smallest:
        smallest=l1[i]
print("Smallest number in the list is:",smallest)