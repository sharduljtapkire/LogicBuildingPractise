def Factorial(iNo):
    
    for i in range(2,iNo+1):
        if(iNo%i==0):
            print("Factors are:",i)


def main():
    print("Enter number : ")
    iValue = int(input())

    Factorial(iValue)

if __name__ == "__main__":
    main()    