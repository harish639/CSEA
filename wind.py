tem=int(input("enter a temp :"))
velo=int(input("enter a wind speed :"))
w=13.12 + 0.6215*tem - 11.37*velo**0.16 + 0.3965*tem*velo**0.16
print('the wind chill index is',w)