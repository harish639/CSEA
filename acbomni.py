a=1024
print("welcome to omni bus travel")
b=int(input("enter your age :"))
if(b>60):
    a=a-(a*20/100)
    print("your fee is :",a)
else:
    print("your fee is:",a)