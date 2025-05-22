# write a program to make basic calculator having basic arithmatic opertaion
# like addition(+),subtraction(-),multiplication(*) and divion(/)

num1 = int(input("enter 1st number for arithmatic Opertion"))
num2 = int(input("enter 2nd number for arithmatic Opertion"))
arithO = int(input("enter type of arithmatic Opertion"))

if(arithO == "+"):
    print(num1+num2)

elif(arithO == "-"):
    print(num1-num2)