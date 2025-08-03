def Summation(iNo):
    iSum=0
    for i in range(1,(iNo+1)):
        iSum=iSum+i
    return iSum

iValue=0
iRes=0

iValue=int(input("Enter Number:"))

iRes=Summation(iValue)

print("Summation is:",iRes)