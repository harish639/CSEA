na=input("enter your name:")
gen=input("enter your gender (M/F):")
ag=int(input("enter your age:"))
day=int(input("enter your total no of working days:"))

if(ag>=18 and ag<30 and gen=='M'):
    x=day*700
    print("the wages =",x)
elif(ag>=18 and ag<30 and gen=='F'):
    x=day*750
    print("the wage=",x)
elif(ag>=30 and ag<=40 and gen=='M'):
    x=day*800
    print("the wage=",x)
elif(ag>=30 and ag<=40 and gen=='F'):
    x=day*800
    print("the wage=",x)
else:
    print("not found")
