arr  = [5, 2, 8, 1, 9]
n = len(arr)
for iin range (n - 1):
    minIndex = i
    for j in range(i+1, n):
        if arr[j] < arr[minIndex]:
            minIndex = j
    arr[i], arr[minIndex] = arr[minIndex], arr[i]
print("Sorted array is:", arr)