"""Write a program to find out whether a student has passed or failed if it requires a 
total of 40% and at least 33% in each subject to pass. Assume 3 subjects and 
take marks as an input from the user"""

marks1 = int(input("Enter the marks of 1st subject:"))
marks2 = int(input("Enter the marks of 2nd subject:"))
marks3 = int(input("Enter the marks of 3rd subject:"))

# total marks percentage in all three subjects
total_percentage=(100*(marks1+marks2+marks3)/300)
print("Your total percentage is: ", total_percentage) 
if(total_percentage>=40 and marks1 >= 33 and marks2>=33 and marks3>=33):
    print("student is passed")
else:
    print("you failed , try again next year")

