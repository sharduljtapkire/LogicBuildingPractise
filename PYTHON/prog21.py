def CheckDivisible(iNo):
    bRes=False
    if(iNo<0):
        iNo=-iNo
    if((iNo%5)==0 and (iNo%3)==0):
        bRes=True
    else:
        bRes=False
    return bRes
    
    
iValue=0
iRes=0
iValue=int(input("Enter a Number :"))

iRes=CheckDivisible(iValue)

if(iRes==True):
    print(f"{iValue} is Divisible by 3 and 5")
else:
    print(f"{iValue} is not Divisible")
    