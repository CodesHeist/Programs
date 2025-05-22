# Write a program to print multiplication table of a given number using for loop. 
num1=int(input("Enter a number whose multiplication table you want : "))
for i in range(1,11):
    print(f"{num1} X {i} = {num1*i}" )