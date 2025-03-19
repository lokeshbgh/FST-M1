def sum(InputNum):
    a = 0
    for x in InputNum:
        a += int(x)
    return a
  

num = input("Enter the numbers for list for sum: ").split(", ")
print("your list - ", num)
result = sum(num)
print("The sum of list elements: ", result)