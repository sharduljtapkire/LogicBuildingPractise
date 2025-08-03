def CheckPrime(iNo):
    Flag=False
    if(iNo<0):
        iNo=-iNo
    
    for i in range(2,int(iNo/2)+1):
        if(iNo%i==0):
            Flag=True
            break
    return Flag

def main():
    
    print("Enter number : ")
    iValue = int(input())

    iRes=CheckPrime(iValue)
    
    if(iRes==True):
        print(f"{iValue} is not a Prime Number")
    else:
        print(f"{iValue} is Prime Number")

if __name__ == "__main__":
    main()    