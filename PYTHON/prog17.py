def CheckEven(iNo):
    if(iNo<0):
        iNo=-iNo
    if((iNo%2)==0):
        return True
    else:
        return False
    
iValue=0
iRes=0
iValue=int(input("Enter Number to Check whether it Even or Odd:"))

iRes=CheckEven(iValue)

if(iRes==True):
    print(f"{iValue} is Even Number")
else:
    print(f"{iValue} is Odd Number")
    