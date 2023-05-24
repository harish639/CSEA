a=int(input("enter 1st side of triangle :"))
b=int(input("enter 2nd side of triangle :"))
c=int(input("enter 3rd side of triangle :"))
if(a+b)>c and (a+c)>b and (b+c)>a:
    print("it is triangle")
else:
    print("it is not a triangle")