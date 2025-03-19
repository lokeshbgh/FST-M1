list = (2, 5, 7, 10, 14, 20)
print(type(list))

for num in list :
    if num % 5 == 0 :
        print(num, "is divisible by 5")
    else :
        print(num, "is not divisible by 5")


list1 = tuple(input("Enter a number list of comma-space separated values: ").split(", "))
print(type(list1))

for num in list1 :
    if int(num) % 5 == 0 :
        print(num, "is divisible by 5")
    else :
        print(num, "is not divisible by 5")