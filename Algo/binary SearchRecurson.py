numbers = [10,20,30,40,50,60,70,80,90,100]

def binary_search_recursive(numbers, target, low, high):
    if low > high:
        return -1

    mid = (low + high) // 2
    if numbers[mid] == target:
        return mid
    elif numbers[mid] < target:
        return binary_search_recursive(numbers, target, mid + 1, high)
    else:
        return binary_search_recursive(numbers, target, low, mid - 1)

result = binary_search_recursive(numbers, 70, 0, len(numbers) - 1)
if result != -1:
    print(f"Element found at index: {result}")
else:
    print("Element not found")