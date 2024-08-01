n= int(input("Enter number of participants: "))
for i in range(n):
    marks1= int(input("Enter makrs 1: "))
    marks2= int(input("Enter marks 2: "))
    marks3= int(input("Enter marks 3: "))
    avg=(marks1+marks2+marks3)/3
    if avg>= 70:
        print("Qualified")
    else:
        print("Not qualified")