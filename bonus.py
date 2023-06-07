a=int(input("enter salary:"))
b=int(input("enter year of service:"))
if(b>10):
    c=a/0.1
    print("Your bonus salary is :",c)
elif(b>6 and b<10):
    c=a/0.08
    print("Your bonus salary is :",c)
elif(b<6):
    c=a/0.05
    print("Your bonus salary is :",c)
else:
    print("try next time")
