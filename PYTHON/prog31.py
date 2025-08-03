def Factorial(iNo):
    Sum=0
    if(iNo<0):
        iNo=-iNo
    
    for i in range(1,int(iNo/2)+1):
        if(iNo%i==0):
            Sum=Sum+i
    return Sum

def main():
    
    print("Enter number : ")
    iValue = int(input())

    iRes=Factorial(iValue)
    
    print("Factorial Sum is:",iRes)

if __name__ == "__main__":
    main()    