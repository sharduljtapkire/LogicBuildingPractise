def Summation(iNo):
    iFact=1
    for i in range(1,(iNo+1)):
        iFact=iFact*i
    return iFact

iValue=0
iRes=0

iValue=int(input("Enter Number:"))

iRes=Summation(iValue)

print("Summation is:",iRes)