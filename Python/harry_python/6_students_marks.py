# Write a program to accept marks of 6 students and display them in a sorted manner.

students=[]

stud1=int(input("Enter marks of :"))
students.append(stud1)
stud2=int(input("Enter marks of :"))
students.append(stud2)
stud3=int(input("Enter marks of :"))
students.append(stud3)
stud4=int(input("Enter marks of :"))
students.append(stud4)
stud5=int(input("Enter marks of :"))
students.append(stud5)
stud6=int(input("Enter marks of :"))
students.append(stud6)
stud7=int(input("Enter marks of :"))
students.append(stud7)

students.sort()
print(students)