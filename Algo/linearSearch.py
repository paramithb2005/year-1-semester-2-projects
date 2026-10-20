def find_smallest_index(numbers):
    if len(numbers) == 0:
        return -1

    smallest_index = 0

    for index in range(1, len(numbers)):
        if numbers[index] < numbers[smallest_index]:
            smallest_index = index

    return smallest_index


numbers = [35, 18, 62, 9, 47, 25]

result = find_smallest_index(numbers)

print("Smallest number:", numbers[result])
print("Index of smallest number:", result)