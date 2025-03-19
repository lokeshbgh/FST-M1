def sum(InputNum):
  if InputNum <= 1:
    return InputNum
  else:
    return InputNum + sum(InputNum-1)
  
num = int(input("Enter the second number for sum: "))
print("The sum is: ", sum(num))