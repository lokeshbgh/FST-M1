list = [1, 2, 1, 4]
print("Given list is ", list)

if list[0] == list[len(list) - 1]:
    print("first and last number of a list is same")
else:
    print("first and last number of a list is not same")


numbers = input("Enter a sequence of comma-space separated values: ").split(", ")
if numbers[0] == numbers[-1]:
    print("True - first and last number of a list is same")
else:
    print("False - first and last number of a list is not same")