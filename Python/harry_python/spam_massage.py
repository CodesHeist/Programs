""" A spam comment is defined as a text containing following keywords: 
“Make a lot of money”, “buy now”, “subscribe this”, “click this”. Write a program 
to detect these spams """

massage1 = "click here"
massage2 = "buy now"
massage3 = "click on the link"
massage4 = "make mmoney online"

massage = (input("enter your comment here: "))
if((massage1 in massage) or (massage2 in massage) or (massage3 in massage) or (massage4 in massage)):
    print("this comment is a spam massage")
else:
    print("this comment is not a spam massage")