def Display(iNo):
    iSum=0
    for i in range(1,(iNo+1)):
        iSum=iSum+i
    return iSum

iValue=0
iValue=int(input("Enter the Value:"))

print(Display(iValue))