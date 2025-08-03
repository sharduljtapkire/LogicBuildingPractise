def Factorial(iNo):
    Sum=0
    if(iNo<0):
        iNo=-iNo
    
    for i in range(1,int(iNo/2)+1):
        if(iNo%i==0):
            Sum=Sum+i
    if(Sum==iNo):
        return True
    else:
        return False

def main():
    
    print("Enter number : ")
    iValue = int(input())

    iRes=Factorial(iValue)
    
    if(iRes==True):
        print(f"{iValue} is Perfect Number")
    else:
        print(f"{iValue} is not a Perfect Number")

if __name__ == "__main__":
    main()    