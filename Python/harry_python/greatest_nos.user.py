# write a program to take the input from user take the input and find the greatest number enter by the user..
num1=int(input("enter the 1st number:"))
num2=int(input("enter the 2nd number:"))
num3=int(input("enter the 3rd number:"))
num4=int(input("enter the 4th number:"))

if(num1>num2 and num1>num3 and num1>num4):
    print("number 1st is the greatest number")
elif(num2>num3 and num2>num4):
    print("number 2nd is the greatest number")
elif(num3>num4):
    print("number 3rd is the greatest number")
else:
    print("number 4th is the greatest number")
