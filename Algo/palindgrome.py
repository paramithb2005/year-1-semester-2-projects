expression = input("Enter an expression: ")

stack = []
balanced = True

for character in expression:
    if character == "(":
        stack.append(character)

    elif character == ")":
        if not stack:
            balanced = False
            break

        stack.pop()

if stack:
    balanced = False

if balanced:
    print("The parentheses are balanced.")
else:
    print("The parentheses are not balanced.")