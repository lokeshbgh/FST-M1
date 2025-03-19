list = []
print("please enter list of numbers (to exit enter space) - ")

number = 0

while(str(number) != ' '):
    number = input("Input a number: ")
    if str(number) == ' ':
        break
    else:
        list.append(int(number))

print(list)
addition = 0

for item in list:
    addition += item

txt = "sum of all the elements in a list -  {}"
print(txt.format(addition))


numbers = input("Enter a sequence of comma separated values: ").split(",")
sum = 0
 
for number in numbers:
    sum += int(number)
 
print(sum)